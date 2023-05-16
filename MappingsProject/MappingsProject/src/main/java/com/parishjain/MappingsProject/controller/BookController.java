package com.parishjain.MappingsProject.controller;

import com.parishjain.MappingsProject.models.Book;
import com.parishjain.MappingsProject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    BookService bookService;


    // ADDING THE BOOK
    @PostMapping(value = "/add")
    ResponseEntity<String> addBook(@RequestBody Book book){

        HttpStatus status;
        String response;
        try{
            bookService.addBook(book);
            status = HttpStatus.OK;
            response = "Book has been successfully saved.";
        }
        catch (Exception ex){
            status = HttpStatus.BAD_REQUEST;
            response = "Something went wrong " + ex;
        }
        return ResponseEntity.status(status).body(response);
    }

    // GETTING ALL BOOKS
    @GetMapping(value = "/all")
    ResponseEntity<List<Book>> getAllBooks(){
        HttpStatus status;
        List<Book> bookList = null;
        try{
            bookList = bookService.getAllBookList();
            status = HttpStatus.CREATED;
        }
        catch (Exception ex){
            status = HttpStatus.BAD_REQUEST;
        }
        return ResponseEntity.status(status).body(bookList);
    }

    // DELETING BOOK
    @DeleteMapping(value = "/delete/id/{id}")
    public String deleteBookById(@PathVariable Long id){
        bookService.deleteBookById(id);
        return "Deleted";
    }
}
