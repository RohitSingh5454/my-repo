package com.example.spring.data.jpa.repository;

import com.example.spring.data.jpa.entity.Customer;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<Customer,Integer> {
}
