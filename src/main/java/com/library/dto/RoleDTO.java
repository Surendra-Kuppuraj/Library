package com.library.dto;

import java.util.List;
import java.util.Set;
import com.library.domain.impl.Privilege;
import com.library.domain.impl.User;

public class RoleDTO {
  private String nameDto;

  private List<User> usersDto;

  private Set<Privilege> privilegesDto;

  public String getNameDto() {
    return nameDto;
  }

  public void setNameDto(String nameDto) {
    this.nameDto = nameDto;
  }

  public List<User> getUsersDto() {
    return usersDto;
  }

  public void setUsersDto(List<User> usersDto) {
    this.usersDto = usersDto;
  }

  public Set<Privilege> getPrivilegesDto() {
    return privilegesDto;
  }

  public void setPrivilegesDto(Set<Privilege> privilegesDto) {
    this.privilegesDto = privilegesDto;
  }
}
