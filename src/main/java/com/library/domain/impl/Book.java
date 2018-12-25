package com.library.domain.impl;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import org.springframework.web.multipart.MultipartFile;
import com.library.domain.EntityID;

@Entity
public class Book implements EntityID {

  private static final long serialVersionUID = 1562848424L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(unique = false, nullable = false)
  private String title;

  @Column(unique = false, nullable = false)
  private String author;

  @Column(unique = false, nullable = false)
  private String publisher;

  @Column(unique = false, nullable = false)
  private LocalDate publicationDate;

  @Column(unique = false, nullable = false)
  private String language;

  @Column(unique = false, nullable = false)
  private String category;

  @Column(unique = false, nullable = false)
  private int numberOfPages;

  @Column(unique = false, nullable = true)
  private String format;

  @Column(unique = false, nullable = false)
  private String isbn;

  @Column(unique = false, nullable = false)
  private double shippingWeight;

  @Column(unique = false, nullable = false)
  private double listPrice;

  @Column(unique = false, nullable = true)
  private double ourPrice;

  @Column(unique = false, nullable = false)
  private LocalDate bookAddedDate;

  @Column(unique = false, nullable = false)
  private boolean active = true;

  @Column(unique = false, nullable = false, columnDefinition = "text")
  private String description;

  @Column(unique = false, nullable = false)
  private int inStockNumber;

  @Transient
  @Column(unique = false, nullable = true)
  private MultipartFile bookImage;


  public Book() {
    super();
  }

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public LocalDate getPublicationDate() {
    return publicationDate;
  }

  public void setPublicationDate(LocalDate localDate) {
    this.publicationDate = localDate;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public double getShippingWeight() {
    return shippingWeight;
  }

  public void setShippingWeight(double shippingWeight) {
    this.shippingWeight = shippingWeight;
  }

  public double getListPrice() {
    return listPrice;
  }

  public void setListPrice(double listPrice) {
    this.listPrice = listPrice;
  }

  public double getOurPrice() {
    return ourPrice;
  }

  public void setOurPrice(double ourPrice) {
    this.ourPrice = ourPrice;
  }

  public LocalDate getBookAddedDate() {
    return bookAddedDate;
  }

  public void setBookAddedDate(LocalDate bookAddedDate) {
    this.bookAddedDate = bookAddedDate;
  }

  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getInStockNumber() {
    return inStockNumber;
  }

  public void setInStockNumber(int inStockNumber) {
    this.inStockNumber = inStockNumber;
  }

  public MultipartFile getBookImage() {
    return bookImage;
  }

  public void setBookImage(MultipartFile bookImage) {
    this.bookImage = bookImage;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (active ? 1231 : 1237);
    result = prime * result + ((author == null) ? 0 : author.hashCode());
    result = prime * result + ((bookAddedDate == null) ? 0 : bookAddedDate.hashCode());
    result = prime * result + ((category == null) ? 0 : category.hashCode());
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + ((format == null) ? 0 : format.hashCode());
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + inStockNumber;
    result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
    result = prime * result + ((language == null) ? 0 : language.hashCode());
    long temp;
    temp = Double.doubleToLongBits(listPrice);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + numberOfPages;
    temp = Double.doubleToLongBits(ourPrice);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((publicationDate == null) ? 0 : publicationDate.hashCode());
    result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
    temp = Double.doubleToLongBits(shippingWeight);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((title == null) ? 0 : title.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    if (active != other.active)
      return false;
    if (author == null) {
      if (other.author != null)
        return false;
    } else if (!author.equals(other.author))
      return false;
    if (bookAddedDate == null) {
      if (other.bookAddedDate != null)
        return false;
    } else if (!bookAddedDate.equals(other.bookAddedDate))
      return false;
    if (category == null) {
      if (other.category != null)
        return false;
    } else if (!category.equals(other.category))
      return false;
    if (description == null) {
      if (other.description != null)
        return false;
    } else if (!description.equals(other.description))
      return false;
    if (format == null) {
      if (other.format != null)
        return false;
    } else if (!format.equals(other.format))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (inStockNumber != other.inStockNumber)
      return false;
    if (isbn == null) {
      if (other.isbn != null)
        return false;
    } else if (!isbn.equals(other.isbn))
      return false;
    if (language == null) {
      if (other.language != null)
        return false;
    } else if (!language.equals(other.language))
      return false;
    if (Double.doubleToLongBits(listPrice) != Double.doubleToLongBits(other.listPrice))
      return false;
    if (numberOfPages != other.numberOfPages)
      return false;
    if (Double.doubleToLongBits(ourPrice) != Double.doubleToLongBits(other.ourPrice))
      return false;
    if (publicationDate == null) {
      if (other.publicationDate != null)
        return false;
    } else if (!publicationDate.equals(other.publicationDate))
      return false;
    if (publisher == null) {
      if (other.publisher != null)
        return false;
    } else if (!publisher.equals(other.publisher))
      return false;
    if (Double.doubleToLongBits(shippingWeight) != Double.doubleToLongBits(other.shippingWeight))
      return false;
    if (title == null) {
      if (other.title != null)
        return false;
    } else if (!title.equals(other.title))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
        + ", publicationDate=" + publicationDate + ", language=" + language + ", category="
        + category + ", numberOfPages=" + numberOfPages + ", format=" + format + ", isbn=" + isbn
        + ", shippingWeight=" + shippingWeight + ", listPrice=" + listPrice + ", ourPrice="
        + ourPrice + ", bookAddedDate=" + bookAddedDate + ", active=" + active + ", description="
        + description + ", inStockNumber=" + inStockNumber + "]";
  }



}
