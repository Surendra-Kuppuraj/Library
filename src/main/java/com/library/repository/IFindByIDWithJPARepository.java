package com.library.repository;

import java.io.Serializable;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFindByIDWithJPARepository<T, ID extends Serializable> extends JpaRepository<T, ID>{
  Optional<T> findById(final Long id);
}
