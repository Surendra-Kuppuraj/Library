package com.library.repository;

import com.library.domain.impl.User;

public interface UserRepository extends IFindByIDWithJPARepository<User, Long> {
    User findByName(final String name);
}
