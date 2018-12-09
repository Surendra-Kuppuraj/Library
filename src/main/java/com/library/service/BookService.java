package com.library.service;

import java.util.List;
import com.library.domain.impl.Book;

public interface BookService extends ServiceOperation<Book> {
  List<Book> blurrySearch(final String title);
}
