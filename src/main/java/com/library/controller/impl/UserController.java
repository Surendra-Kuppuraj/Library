package com.library.controller.impl;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.library.controller.AbstractController;
import com.library.controller.ISortingController;
import com.library.domain.impl.User;
import com.library.service.UserService;
import com.library.util.URLMapping;

@RestController
@RequestMapping(value = URLMapping.USER)
public class UserController extends AbstractController<User> implements ISortingController<User> {

  @Autowired
  private UserService userService;


  @Override
  public List<User> findAllPaginatedAndSorted(int page, int size, String sortBy, String sortOrder) {
    return null;
  }

  @Override
  public List<User> findAllPaginated(int page, int size) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<User> findAllSorted(String sortBy, String sortOrder) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<User> findAll(HttpServletRequest request) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  protected UserService getService() {
    return userService;
  }

}
