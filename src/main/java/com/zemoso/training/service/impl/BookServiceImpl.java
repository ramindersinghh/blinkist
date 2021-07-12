package com.zemoso.training.service.impl;

import com.zemoso.training.dao.BookRepository;
import com.zemoso.training.entity.Book;
import com.zemoso.training.entity.Category;
import com.zemoso.training.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository=bookRepository;
    }


    @Override
    public int save(Book book) {
        Book bookSaved=bookRepository.save(book);
        return bookSaved.getBook_id();

    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public List<Book> getBooksByCategory(Category category) {
        return bookRepository.findByCategory(category);
    }

    @Override
    public Optional<Book> getBookByBookId(int bookId) {
        return bookRepository.findById(bookId);
    }
}
