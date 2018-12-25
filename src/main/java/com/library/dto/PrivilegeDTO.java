package com.library.dto;

import java.util.List;
import com.library.domain.impl.Role;

public class PrivilegeDTO {

  private String nameDto;

  private String descriptionDto;

  private List<Role> rolesDto;

  public String getNameDto() {
    return nameDto;
  }

  public void setNameDto(String nameDto) {
    this.nameDto = nameDto;
  }

  public String getDescriptionDto() {
    return descriptionDto;
  }

  public void setDescriptionDto(String descriptionDto) {
    this.descriptionDto = descriptionDto;
  }

  public List<Role> getRolesDto() {
    return rolesDto;
  }

  public void setRolesDto(List<Role> rolesDto) {
    this.rolesDto = rolesDto;
  }
}
