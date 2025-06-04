package com.example.demoSpringBootCrud.repository;

import com.example.demoSpringBootCrud.entity.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<User, Integer> {
}
