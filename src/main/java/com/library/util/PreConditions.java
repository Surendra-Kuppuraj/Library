package com.library.util;

import com.library.exception.ApplicationEntityNotFoundException;

public final class PreConditions {

  private PreConditions() {
    throw new AssertionError();
  }
  
  public static <T> T checkEntityExists(final T entity) {
    if(entity == null) {
      throw new ApplicationEntityNotFoundException();
    }
    return entity;
  }

}
