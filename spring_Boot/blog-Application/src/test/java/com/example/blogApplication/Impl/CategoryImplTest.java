package com.example.blogApplication.Impl;

import com.example.blogApplication.repository.categoryRepository;
import com.example.blogApplication.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class CategoryImplTest {
    @Autowired
    private categoryRepository repository;
    @MockBean
    private categoryService service;

}
