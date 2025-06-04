package com.example.OaathImplementation.service;

import com.example.OaathImplementation.entity.User;
import com.example.OaathImplementation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;
@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findByUserName(username);
        if (user==null){
            throw new UsernameNotFoundException("User not available");
        }
        return new org.springframework.security.core.userdetails.
                User(user.getUserName(),user.getPassword(),new ArrayList<>());
    }
}
