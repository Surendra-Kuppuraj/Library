package com.library.repository;

import org.springframework.stereotype.Repository;
import com.library.domain.impl.Privilege;

public interface PrivilegeRepository extends IFindByIDWithJPARepository<Privilege, Long>{
  Privilege findByName(final String name);
}
