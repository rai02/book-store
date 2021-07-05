package com.devashish.bookstore.service;

import java.util.List;
import java.util.Objects;

import com.devashish.bookstore.entity.Book;
import com.devashish.bookstore.repository.BookStoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookStoreServiceImpl implements BookStoreService{

    @Autowired
    private BookStoreRepository bookStoreRepository;

    @Override
    public Book saveBook(Book book) {
        return bookStoreRepository.save(book);
    }

    @Override
    public List<Book> fetchBookList() {
        return bookStoreRepository.findAll();
    }

    @Override
    public void deleteBook(Long id) {
        bookStoreRepository.deleteById(id);
    }

    @Override
    public Book updateBookById(Long id, Book book) {
        Book bookdb = bookStoreRepository.findById(id).get();
        if(Objects.nonNull(book.getTitle()) && "".equalsIgnoreCase(book.getTitle())){
            bookdb.setTitle(book.getTitle());
        }
        if(Objects.nonNull(book.getAuthor()) && "".equalsIgnoreCase(book.getAuthor())){
            bookdb.setTitle(book.getAuthor());
        }
        if(Objects.nonNull(book.getPrice()) ){
            bookdb.setPrice(book.getPrice());
        }
        return bookStoreRepository.save(bookdb);
    }
    
}
