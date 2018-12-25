package com.library.exception;

public class ConflictException extends RuntimeException {
  private static final long serialVersionUID = 35353653535L;

  public ConflictException() {
    super();
  }

  public ConflictException(final String message) {
    super(message);
  }

  public ConflictException(final Throwable cause) {
    super(cause);
  }


  public ConflictException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
