package com.zemoso.training.service.impl;

import com.zemoso.training.dao.BookRepository;
import com.zemoso.training.entity.Book;
import com.zemoso.training.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl() {
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book findById(int theId) {
        return null;
    }

    @Override
    public void save(Book theEmployee) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
