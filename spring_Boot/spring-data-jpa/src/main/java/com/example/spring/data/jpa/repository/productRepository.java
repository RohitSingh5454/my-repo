package com.example.spring.data.jpa.repository;

import com.example.spring.data.jpa.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<Product,Integer> {
}
