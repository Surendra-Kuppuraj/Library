package com.library.service;

import static java.util.stream.Stream.of;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.transaction.annotation.Transactional;
import com.library.domain.EntityID;
import com.library.repository.IFindByIDWithJPARepository;
import com.library.util.EntityPreConditions;

@Transactional
public abstract class AbstractService<T extends EntityID> implements ServiceOperation<T>  {

  public AbstractService() {
    super();
  }

  protected abstract IFindByIDWithJPARepository<T, Long> getDao();

  @Override
  @Transactional(readOnly = true)
  public T findOne(final long id) {
    Optional<T> entity = getDao().findById(id);
    return entity.orElse(null);
  }


  @Override
  @Transactional(readOnly = true)
  public List<T> findAll() {
    return (List<T>) getDao().findAll(); 
  }

  @Override
  @Transactional(readOnly = true)
  public List<T> findAllPaginatedAndSorted(final int page, final int size, final String sortBy,
      final String sortOrder) {
    final Sort sortInfo = constructSort(sortBy, sortOrder);
    final List<T> content = getDao().findAll(new PageRequest(page, size, sortInfo)).getContent();
    if (content == null) {
      return Collections.emptyList();
    }
    return content;
  }


  @Override
  @Transactional(readOnly = true)
  public List<T> findAllPaginated(final int page, final int size) {
    final List<T> content = getDao().findAll( new PageRequest(page, size, null)).getContent();
    if (content == null) {
      return Collections.emptyList();
    }
    return content;
  }

  @SuppressWarnings("unchecked")
  @Override
  @Transactional(readOnly = true)
  public List<T> findAllSorted(final String sortBy, final String sortOrder) {
    final Sort sortInfo = constructSort(sortBy, sortOrder);
    return (List<T>) of(getDao().findAll(sortInfo));
  }

  @Override
  public T create(final T entity) {
    EntityPreConditions.checkEntityExists(entity);
    final T persistedEntity = getDao().save(entity);
    return persistedEntity;
  }

  @Override
  public void update(final T entity) {
    EntityPreConditions.checkEntityExists(entity);
    getDao().save(entity);
  }

  @Override
  public void deleteAll() {
    getDao().deleteAll();
  }

  @Override
  public void delete(final long id) {
    final Optional<T> entity = getDao().findById(id);
    if (entity.isPresent()) {
      getDao().delete(entity.get());
    }
  }

  @Override
  @Transactional(readOnly = true)
  public long count() {
    return getDao().count();
  }

  protected final Sort constructSort(final String sortBy, final String sortOrder) {
    Sort sortInfo = null;
    if (sortBy != null) {
      sortInfo = new Sort(Direction.fromString(sortOrder), sortBy);
    }
    return sortInfo;
  }
}
