package com.example.demoSpringBootCrud.service;

import com.example.demoSpringBootCrud.entity.User;
import com.example.demoSpringBootCrud.repository.userRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    private userRepository userRepository;
    public User saveUser(User user){
        User saved=userRepository.save(user);
        return saved;
    }
    public User getUserById(Integer id){
        User getUser=userRepository.findById(id).orElse(null);
        return getUser;
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public User updateUser(User user){
        User existing=userRepository.findById(user.getUid()).get();
        existing.setEmail(user.getEmail());
        existing.setUname(user.getUname());
        return userRepository.save(existing);
    }
}

