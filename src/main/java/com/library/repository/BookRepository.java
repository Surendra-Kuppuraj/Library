package com.library.repository;

import java.util.List;
import com.library.domain.impl.Book;

public interface BookRepository extends IFindByIDWithJPARepository<Book, Long> {
  List<Book> findByTitleContaining(String keyword);
}
