package com.library.exception;

public class ResourceNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 675735635L;

  public ResourceNotFoundException() {
    super();
  }

  public ResourceNotFoundException(final String message) {
    super(message);
  }

  public ResourceNotFoundException(final Throwable cause) {
    super(cause);
  }


  public ResourceNotFoundException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
