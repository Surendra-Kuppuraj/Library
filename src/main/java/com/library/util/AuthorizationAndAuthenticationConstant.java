/**
 * 
 */
package com.library.util;

/**
 * @author Surendra Kumar
 *
 */
public final  class AuthorizationAndAuthenticationConstant {

  public static final String ADMIN_USERNAME = "admin";
  public static final String ADMIN_EMAIL = "admin@library.com";
  
  public static final String USER_USERNAME ="user";
  public static final String USER_EMAIL = "user@library.com";
  
  
  public static final class Privillages {    
    //User
    public static final String CAN_USER_READ ="ROLE_USER_READ";
    public static final String CAN_USER_WRITE = "ROLE_USER_WRITE";
    
    //ROLE
    public static final String CAN_ROLE_READ ="ROLE_ROLE_READ";
    public static final String CAN_ROLE_WRITE = "ROLE_ROLE_WRITE";
    
    //PRIVILLAGE
    public static final String CAN_PRIVILLAGE_READ ="ROLE_PRIVILLAGE_READ";
    public static final String CAN_PRIVILLAGE_WRITE = "ROLE_PRIVILLAGE_WRITE";
    
    //BOOK
    public static final String CAN_BOOK_READ ="ROLE_BOOK_READ";
    public static final String CAN_BOOK_WRITE = "ROLE_BOOK_WRITE";
  }
  
  public static final class Roles {
    public static final String ROLE_ADMIN ="ROLE_ADMIN";
    public static final String ROLE_USER = "ROLE_USER";
  }
  
  private AuthorizationAndAuthenticationConstant() {
    throw new AssertionError();
  }
}
