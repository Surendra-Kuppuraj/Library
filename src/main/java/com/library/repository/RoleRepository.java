package com.library.repository;

import com.library.domain.impl.Role;

public interface RoleRepository extends IFindByIDWithJPARepository<Role, Long>{
  Role findByName(final String name);

}
