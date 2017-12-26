package com.jarc.springboot.practices.repository;

import com.jarc.springboot.practices.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {

}
