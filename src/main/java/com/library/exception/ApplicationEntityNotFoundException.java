package com.library.exception;

public final class ApplicationEntityNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 122442424L;

  public ApplicationEntityNotFoundException() {
    super();
  }

  public ApplicationEntityNotFoundException(final String message) {
    super(message);
  }

  public ApplicationEntityNotFoundException(final Throwable cause) {
    super(cause);
  }
 

  public ApplicationEntityNotFoundException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
