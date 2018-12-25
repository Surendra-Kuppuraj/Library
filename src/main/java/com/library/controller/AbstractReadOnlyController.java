package com.library.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.library.domain.EntityID;
import com.library.exception.ResourceNotFoundException;
import com.library.service.ServiceOperation;
import com.library.util.RestPreConditions;

public abstract class AbstractReadOnlyController<T extends EntityID> {

  protected final T finalOneInternal(final Long id) {
    return RestPreConditions.checkNotNull(getService().findOne(id));
  }

  protected final List<T> findAllInternal(final HttpServletRequest request) {
    if (request.getParameterNames().hasMoreElements()) {
      throw new ResourceNotFoundException();
    }
    return getService().findAll();
  }

  protected final List<T> findAllPaginatedAndSortedInternal(final int page, final int size,
      final String sortBy, final String sortOrder) {
    return getService().findAllPaginatedAndSorted(page, size, sortBy, sortOrder);
  }

  protected final List<T> findAllPaginatedInternal(final int page, final int size) {
    return getService().findAllPaginated(page, size);
  }

  protected final List<T> findAllSortedInternal(final String sortBy, final String sortOrder) {
    return getService().findAllSorted(sortBy, sortOrder);
  }

  protected final long countInternal() {
    return getService().count();
  }

  @RequestMapping(method = RequestMethod.GET, value = "/count")
  @ResponseBody
  @ResponseStatus(value = HttpStatus.OK)
  public long count() {
    return countInternal();
  }

  protected abstract ServiceOperation<T> getService();
}
