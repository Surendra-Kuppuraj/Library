package com.library.controller;

import com.library.domain.EntityID;
import com.library.util.RestPreConditions;

public abstract class AbstractController<T extends EntityID> extends AbstractReadOnlyController<T> {

  protected final T createInternal(final T resource) {
    RestPreConditions.checkRequestElementNotNull(resource);
    RestPreConditions.checkRequestState(resource.getId() == null);
    return getService().create(resource);
  }

  protected final void updateInternal(final Long id, final T resource) {
    RestPreConditions.checkRequestElementNotNull(resource);
    RestPreConditions.checkRequestElementNotNull(resource.getId());
    RestPreConditions.checkRequestState(resource.getId() == id);
    RestPreConditions.checkNotNull(getService().findOne(resource.getId()));
    getService().update(resource);
  }

  protected final void deleteByIdInternal(final Long id) {
    getService().delete(id);
  }
}
