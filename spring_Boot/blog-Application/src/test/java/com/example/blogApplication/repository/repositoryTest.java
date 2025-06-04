package com.example.blogApplication.repository;

import com.example.blogApplication.entity.Category;
import com.example.blogApplication.entity.Post;
import com.example.blogApplication.entity.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class repositoryTest {
    @Autowired
    private userRepository userRepository;

    @Test
    public void repoTest(){
        String className=this.userRepository.getClass().getName();
        String packName=this.userRepository.getClass().getPackageName();
        System.out.println(className);
        System.out.println(packName);
    }
}
