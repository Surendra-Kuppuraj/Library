package com.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.library.domain.impl.Role;
import com.library.repository.RoleRepository;
import com.library.service.AbstractService;
import com.library.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl extends AbstractService<Role> implements RoleService {

  @Autowired
  private RoleRepository roleRepository;

  
  @Override
  public Role findByName(final String roleName) {
    return getDao().findByName(roleName);
  }

  @Override
  protected RoleRepository getDao() {
    return roleRepository;
  }

}
