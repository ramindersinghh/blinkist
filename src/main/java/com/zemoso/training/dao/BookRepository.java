package com.zemoso.training.dao;

import com.zemoso.training.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
//Data access Object class
//injecting data source into this class and used it instantiate JdbcTemplate this turns out to be Thread Safe
public interface BookRepository extends JpaRepository<Book, Integer> {
}
