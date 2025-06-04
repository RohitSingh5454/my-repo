package com.example.demoSpringBootCrud.controller;

import com.example.demoSpringBootCrud.entity.Book;
import com.example.demoSpringBootCrud.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class bookController {
    @Autowired
    private bookService bookService;
    @PostMapping("saveBooks")
    public ResponseEntity<Book> createUser(@RequestBody Book book){
        Book saveBooks=bookService.saveBooks(book);
        return new ResponseEntity<>(saveBooks, HttpStatus.CREATED);
    }
    @GetMapping("getBook")
    public ResponseEntity<Book> getBookById(@PathVariable("id") int id){
        Book getById=bookService.getBookById(id).orElse(null);
        return new ResponseEntity<>(getById,HttpStatus.OK);
    }
    @GetMapping("getAllBook")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books=bookService.getAllBooks();
        return new ResponseEntity<>(books,HttpStatus.OK);
    }
    @PutMapping("updateBook/{id}")
    public ResponseEntity<Book> updateBooks(@PathVariable("id") int id,@RequestBody Book book){
        book.setId(id);
        Book updateBook=bookService.updateBook(book);
        return new ResponseEntity<>(updateBook,HttpStatus.OK);
    }
}
