package com.library.util;

import com.library.exception.BadRequestException;
import com.library.exception.ConflictException;
import com.library.exception.ResourceNotFoundException;

public final class RestPreConditions {

  private RestPreConditions() {
    throw new AssertionError();
  }

  public static <T> T checkNotNull(final T reference) {
    return checkNotNull(reference, null);
  }

  public static <T> T checkNotNull(final T reference, final String message) {
    if (reference == null) {
      throw new ResourceNotFoundException(message);
    }
    return reference;
  }

  public static <T> T checkRequestElementNotNull(final T reference) {
    return checkRequestElementNotNull(reference);
  }

  public static <T> T checkRequestElementNotNull(final T reference, final String message) {
    if (reference == null) {
      throw new BadRequestException(message);
    }
    return reference;
  }

  public static void checkRequestState(final boolean expression) {
    checkRequestState(expression, null);
  }

  public static void checkRequestState(final boolean expression, final String message) {
    if (!expression) {
      throw new ConflictException(message);
    }
  }
}
