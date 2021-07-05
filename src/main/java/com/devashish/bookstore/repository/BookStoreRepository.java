package com.devashish.bookstore.repository;

import com.devashish.bookstore.entity.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStoreRepository extends JpaRepository<Book,Long>{
    
}
