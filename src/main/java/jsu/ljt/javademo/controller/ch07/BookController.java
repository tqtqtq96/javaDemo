package jsu.ljt.javademo.controller.ch07;

import jsu.ljt.javademo.pojo.ch07.Book;
import jsu.ljt.javademo.pojo.ch07.EBook;
import jsu.ljt.javademo.pojo.ch07.PrintedBook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
  private List<Book> books = new ArrayList<>();

  @PostMapping("/createEBook")
  public String createEBook(@RequestParam String title, @RequestParam String author, @RequestParam double price, @RequestParam double fileSize) {
    EBook ebook = new EBook(title, author, price, fileSize);
    books.add(ebook);
    return "电子书创建成功！";
  }

  @PostMapping("/createPrintedBook")
  public String createPrintedBook(@RequestParam String title, @RequestParam String author, @RequestParam double price, @RequestParam double shippingWeight) {
    PrintedBook printedBook = new PrintedBook(title, author, price, shippingWeight);
    books.add(printedBook);
    return "纸质书创建成功！";
  }

  @GetMapping("/books")
  public List<Book> getBooks() {
    return books;
  }
}

