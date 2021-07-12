package com.zemoso.training.service;

import com.zemoso.training.entity.Book;
import com.zemoso.training.entity.Category;

import java.util.List;
import java.util.Optional;

public interface BookService {

    public int save(Book book);

    public Book update(Book book);

    public void deleteById(int id);

    public List<Book> getAllBooks();

    public List<Book> getBooksByCategory(Category category);

    public Optional<Book> getBookByBookId(int bookId);

}
