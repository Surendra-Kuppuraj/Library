package com.library.domain;

import java.io.Serializable;

public interface EntityID extends Serializable{
  Long getId();
  void setId(final Long id);
}
