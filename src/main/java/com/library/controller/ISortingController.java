package com.library.controller;

import java.io.Serializable;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface ISortingController<T extends Serializable> {
  public List<T> findAllPaginatedAndSorted(final int page, final int size, final String sortBy,
      final String sortOrder);

  public List<T> findAllPaginated(final int page, final int size);

  public List<T> findAllSorted(final String sortBy, final String sortOrder);

  public List<T> findAll(final HttpServletRequest request);
}
