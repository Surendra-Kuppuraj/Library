package com.library.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.library.domain.impl.User;
import com.library.repository.UserRepository;
import com.library.service.AbstractService;
import com.library.service.UserService;

@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  protected UserRepository getDao() {
    return userRepository;
  }

  @Override
  @Transactional(readOnly = true)
  public User getCurrentUser() {
    //TODO need implementaion of securityUtils
    return null;
  }

  @Override
  @Transactional(readOnly = true)
  public User findByName(String userName) {  
    return getDao().findByName(userName);
  }


}
