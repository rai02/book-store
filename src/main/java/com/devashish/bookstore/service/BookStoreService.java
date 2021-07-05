package com.devashish.bookstore.service;

import java.util.List;

import com.devashish.bookstore.entity.Book;

import org.springframework.stereotype.Service;

@Service
public interface BookStoreService {

    Book saveBook(Book book);

    List<Book> fetchBookList();

    void deleteBook(Long id);

    Book updateBookById(Long id, Book book);
    
}
