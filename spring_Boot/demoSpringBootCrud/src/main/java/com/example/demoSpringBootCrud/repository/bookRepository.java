package com.example.demoSpringBootCrud.repository;

import com.example.demoSpringBootCrud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepository extends JpaRepository<Book,Integer> {
}
