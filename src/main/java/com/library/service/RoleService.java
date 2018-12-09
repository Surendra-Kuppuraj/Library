package com.library.service;

import com.library.domain.impl.Role;

public interface RoleService extends ServiceOperation<Role>{
  Role findByName(final String roleName);
}
