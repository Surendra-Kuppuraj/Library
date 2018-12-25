package com.library.repository;

import org.springframework.stereotype.Repository;
import com.library.domain.impl.Role;

public interface RoleRepository extends IFindByIDWithJPARepository<Role, Long>{
  Role findByName(final String name);

}
