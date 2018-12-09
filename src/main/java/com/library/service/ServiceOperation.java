package com.library.service;

import java.io.Serializable;
import java.util.List;

public interface ServiceOperation<T extends Serializable> {

  T create(final T resource);

  void update(final T resource);

  void delete(final long id);

  void deleteAll();

  long count();

  T findOne(final long id);

  List<T> findAll();

  List<T> findAllSorted(final String sortBy, final String sortOrder);

  List<T> findAllPaginated(final int page, final int size);

  List<T> findAllPaginatedAndSorted(final int page, final int size, final String sortBy,
      final String sortOrder);
}
