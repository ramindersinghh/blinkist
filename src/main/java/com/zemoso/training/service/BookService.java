package com.zemoso.training.service;

import com.zemoso.training.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAll();

    public Book findById(int theId);

    public void save(Book theEmployee);

    public void deleteById(int theId);

}
