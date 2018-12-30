package com.library.security;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.library.domain.impl.Privilege;
import com.library.domain.impl.Role;
import com.library.domain.impl.User;
import com.library.service.UserService;

@Component
public class BookStoreUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	public BookStoreUserDetailsService() {
		super();
	}

	@Override
	public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
		Objects.requireNonNull(username);
		final User user = userService.findByName(username);
		if (user == null) {
			throw new UsernameNotFoundException("Username was not found: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getName(), user.getPassword(),
				getAuthorities(user.getRoles()));
	}

	private List<String> getPrivileges(Collection<Role> roles) {
		List<String> privilegeList = roles.stream().map(Role::getPrivileges).flatMap(privilege -> privilege.stream())
				.map(Privilege::getName).collect(Collectors.toList());
		return privilegeList;
	}

	private List<GrantedAuthority> getGrantedAuthorities(List<String> privilages) {
		List<GrantedAuthority> authorities  = privilages.stream().map(privilege -> new SimpleGrantedAuthority(privilege)).collect(Collectors.toList());
		return authorities;
	}

	private Collection<? extends GrantedAuthority> getAuthorities(Collection<Role> roles) {
		return getGrantedAuthorities(getPrivileges(roles));
	}
}
