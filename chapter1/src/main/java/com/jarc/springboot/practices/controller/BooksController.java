package com.jarc.springboot.practices.controller;

import com.jarc.springboot.practices.domain.Book;
import com.jarc.springboot.practices.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private BooksRepository booksRepository;

    @Autowired
    public BooksController(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getBooks() {
        return this.booksRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book getPractice(@PathVariable("id") long id) {
        return this.booksRepository.findOne(id);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Book addBook(@RequestBody Book book) {
        Book bookSaved = this.booksRepository.save(book);
        return bookSaved;
    }

}
