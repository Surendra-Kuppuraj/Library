package com.library.util;

import com.library.exception.ApplicationEntityNotFoundException;

public final class EntityPreConditions {

  private EntityPreConditions() {
    throw new AssertionError();
  }
  
  public static <T> T checkEntityExists(final T entity) {
    if(entity == null) {
      throw new ApplicationEntityNotFoundException();
    }
    return entity;
  }

}
