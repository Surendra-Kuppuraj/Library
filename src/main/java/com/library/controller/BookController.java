package com.library.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.library.domain.impl.Book;
import com.library.service.BookService;

@RestController
public class BookController {
  
  
  @RequestMapping("/greeting")
  public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
      return "Hello ";
  }
  
  @Autowired
  private BookService bookService;
  
//  @PostMapping
//  public ResponseEntity<String> addBook(@RequestBody final Book book) {
//       bookService.create(book);
//       return new ResponseEntity<>(HttpStatus.OK);
//  }
//
//  @GetMapping()
//  public List<Book> getBookList() {
//      return bookService.findAll();
//  }

}
