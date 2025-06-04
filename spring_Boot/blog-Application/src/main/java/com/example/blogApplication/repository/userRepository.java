package com.example.blogApplication.repository;

import com.example.blogApplication.entity.User;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface userRepository extends JpaRepository<User, Integer> {
}
