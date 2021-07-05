package com.devashish.bookstore.controller;

import java.util.List;

import com.devashish.bookstore.entity.Book;
import com.devashish.bookstore.service.BookStoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreController {
    // ==> BookStore
	// -> saveBook (EndPoint: /book) [PostMapping] "DONE"

	// -> fetchBookList (EndPoint: /book) [GetMapping] "DONE"

	// -> deleteBook (EndPoint: /book/{id}) [DeleteMapping] 

	// -> updateBook (EndPoint: /book/{id}) [UpdateMapping]

    @Autowired
    private BookStoreService bookStoreService;

    @PostMapping("/book")
    public Book saveBook(@RequestBody Book book){
        return bookStoreService.saveBook(book);
    }

    @GetMapping("/book")
    public List<Book> fetchBookList(){
        return bookStoreService.fetchBookList();
    }

    @DeleteMapping("/book/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        bookStoreService.deleteBook(id);
        return "Book Deleted successfully";
        // return "Book Deleted successfully";
    }

    @PutMapping("/book/{id}")
    public Book updateBookById(@PathVariable("id") Long id, @RequestBody Book book){
        return bookStoreService.updateBookById(id,book);

    }

    
}
