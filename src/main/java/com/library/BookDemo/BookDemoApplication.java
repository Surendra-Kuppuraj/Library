package com.library.BookDemo;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import com.library.config.PresistanceJpaConfig;
import com.library.config.ServiceConfiguration;
import com.library.config.WebConfiguration;
import com.library.domain.impl.Book;
import com.library.service.BookService;

@SpringBootApplication()
@Import({WebConfiguration.class, PresistanceJpaConfig.class, ServiceConfiguration.class})
public class BookDemoApplication implements CommandLineRunner {

  @Autowired
  private BookService bookService;
  
  public static void main(String[] args) {
    SpringApplication.run(BookDemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
     Book book = new Book();
     book.setId(23l);
     book.setActive(true);
     book.setAuthor("hh");
     book.setBookAddedDate(LocalDate.now());
     book.setCategory("category");
     book.setDescription("Description");
     book.setFormat("Paper");
     book.setInStockNumber(5);
     book.setIsbn("f8666-567-788");
     book.setLanguage("English");
     book.setOurPrice(56);
     book.setListPrice(57);
     book.setPublicationDate(LocalDate.now());
     book.setPublisher("surendra");
     book.setTitle("BOOK TITLE");
     System.out.println(book);
     Book bookCreated = bookService.create(book);
     System.out.println("************************************************");
     System.out.println(bookCreated);
  }
}
