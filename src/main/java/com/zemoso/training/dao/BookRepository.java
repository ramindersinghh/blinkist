package com.zemoso.training.dao;

import com.zemoso.training.entity.Book;
import com.zemoso.training.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//Data access Object class
//injecting data source into this class and used it instantiate JdbcTemplate this turns out to be Thread Safe
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query(value = "select b from Book b")
    List<Book> getAllBooks();

    @Query(value = "select b from Book b where b.category=:category")
    List<Book> findByCategory(Category category);
}
