package com.example.OaathImplementation.repository;

import com.example.OaathImplementation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
