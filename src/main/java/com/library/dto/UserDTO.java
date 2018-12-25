package com.library.dto;

import java.util.Set;
import com.library.domain.impl.Role;

public class UserDTO {

  private String nameDto;

  private String emailDto;

  private String passwordDto;

  private Boolean lockedDto;
 
  private Set<Role> rolesDto;

  public String getNameDto() {
    return nameDto;
  }

  public void setNameDto(String nameDto) {
    this.nameDto = nameDto;
  }

  public String getEmailDto() {
    return emailDto;
  }

  public void setEmailDto(String emailDto) {
    this.emailDto = emailDto;
  }

  public String getPasswordDto() {
    return passwordDto;
  }

  public void setPasswordDto(String passwordDto) {
    this.passwordDto = passwordDto;
  }

  public Boolean getLockedDto() {
    return lockedDto;
  }

  public void setLockedDto(Boolean lockedDto) {
    this.lockedDto = lockedDto;
  }

  public Set<Role> getRolesDto() {
    return rolesDto;
  }

  public void setRolesDto(Set<Role> rolesDto) {
    this.rolesDto = rolesDto;
  }
}
