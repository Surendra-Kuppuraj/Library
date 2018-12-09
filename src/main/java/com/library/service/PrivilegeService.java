package com.library.service;

import com.library.domain.impl.Privilege;

public interface PrivilegeService extends ServiceOperation<Privilege> {
  Privilege findByName(final String name);
}
