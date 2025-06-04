package com.example.demoSpringBootCrud.service;

import com.example.demoSpringBootCrud.entity.Book;
import com.example.demoSpringBootCrud.repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class bookService {
    @Autowired
    bookRepository bookRepository;
    public Book saveBooks(Book book){
        Book book1=bookRepository.save(book);
        return book1;
    }
    public Optional<Book> getBookById(Integer id){
        return bookRepository.findById(id);
    }
    public Book updateBook(Book book){
        Book existing=bookRepository.findById(book.getId()).get();
        existing.setName(book.getName());
        existing.setPrice(book.getPrice());
        existing.setSummary(book.getSummary());
        return bookRepository.save(existing);
    }
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

}
