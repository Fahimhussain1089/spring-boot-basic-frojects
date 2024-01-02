package com.api.book.bootrestbook2.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bootrestbook2.entities.Book;

public interface BookRepository extends CrudRepository<Book,Integer>{
    public Book findById(int id);
}
