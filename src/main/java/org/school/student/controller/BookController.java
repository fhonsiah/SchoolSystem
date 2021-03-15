package org.school.student.controller;

import org.school.student.entity.Book;
import org.school.student.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value = "/book",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getBooks(){

        return  bookRepository.findAll();
    }

    @PostMapping(value = "/book/create",produces = MediaType.APPLICATION_JSON_VALUE)
    public  Book saveBook(@RequestBody Book book){

        return bookRepository.save(book);
    }
}
