package com.library.controller.impl;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.library.controller.AbstractController;
import com.library.controller.ISortingController;
import com.library.domain.impl.Book;
import com.library.dto.BookDTO;
import com.library.mapper.MappingConverter;
import com.library.service.BookService;
import com.library.util.QueryConstants;
import com.library.util.URLMapping;

@RestController
@RequestMapping(value = URLMapping.BOOK)
public class BookController extends AbstractController<Book>
    implements ISortingController<BookDTO> {

  @Autowired
  private BookService bookService;

  @RequestMapping(method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.CREATED)
  public void create(@RequestBody @Valid final BookDTO bookDTO) {
    createInternal(MappingConverter.entityConverter(bookDTO, Book.class));
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  @ResponseStatus(HttpStatus.OK)
  public void update(@PathVariable("id") final Long id, @RequestBody @Valid final BookDTO bookDTO) {
    updateInternal(id, MappingConverter.entityConverter(bookDTO, Book.class));
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable("id") final Long id) {
    deleteByIdInternal(id);
  }

  @Override
  @RequestMapping(params = {QueryConstants.PAGE, QueryConstants.SIZE, QueryConstants.SORT_BY},
      method = RequestMethod.GET)
  @ResponseBody
  public List<BookDTO> findAllPaginatedAndSorted(final int page, final int size,
      final String sortBy, final String sortOrder) {
    final List<Book> bookList = findAllPaginatedAndSortedInternal(page, size, sortBy, sortOrder);
    return convertEntityToDto(bookList);
  }

  @Override
  @RequestMapping(params = {QueryConstants.PAGE, QueryConstants.SIZE}, method = RequestMethod.GET)
  @ResponseBody
  public List<BookDTO> findAllPaginated(final int page, final int size) {
    final List<Book> bookList = findAllPaginatedInternal(page, size);
    return convertEntityToDto(bookList);
  }

  @Override
  @RequestMapping(params = {QueryConstants.SORT_BY}, method = RequestMethod.GET)
  @ResponseBody
  public List<BookDTO> findAllSorted(final String sortBy, final String sortOrder) {
    final List<Book> bookList = findAllSortedInternal(sortBy, sortOrder);
    return convertEntityToDto(bookList);
  }

  @Override
  @RequestMapping(method = RequestMethod.GET)
  @ResponseBody
  public List<BookDTO> findAll(final HttpServletRequest request) {
    List<Book> bookList = new ArrayList<>();
    bookList = (List<Book>) findAllInternal(request);
    return convertEntityToDto(bookList);
  }

  @Override
  protected final BookService getService() {
    return bookService;
  }

  private List<BookDTO> convertEntityToDto(List<Book> bookList) {
    return MappingConverter.mapListConverter(bookList, BookDTO.class);
  }
}
