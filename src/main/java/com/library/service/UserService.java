package com.library.service;

import com.library.domain.impl.User;

public interface UserService extends ServiceOperation<User> {
  User getCurrentUser();

  User findByName(final String userName);
}
