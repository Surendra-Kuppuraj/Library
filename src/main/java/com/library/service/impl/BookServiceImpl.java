package com.library.service.impl;

import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.library.domain.impl.Book;
import com.library.repository.BookRepository;
import com.library.service.AbstractService;
import com.library.service.BookService;

@Service
@Transactional
public class BookServiceImpl extends AbstractService<Book> implements BookService {
  
  @Autowired
  private BookRepository bookRepository;

  public BookServiceImpl() {
    super();
  }

  @Override
  protected final BookRepository getDao() {
    return bookRepository;
  }

  @Override
  @Transactional(readOnly = true)
  public List<Book> blurrySearch(String title) {
    List<Book> bookList = getDao().findByTitleContaining(title);
    if(bookList == null) {
      return Collections.emptyList();
    }
    return bookList;
  }
}
