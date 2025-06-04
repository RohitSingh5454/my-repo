package com.example.blogApplication.service;

import com.example.blogApplication.payloads.DtoCategory;

import java.util.List;

public interface categoryService {
     DtoCategory createCategory(DtoCategory dtoCategory);
     DtoCategory updateCategory(DtoCategory dtoCategory,Integer categoryId);
     String deleteCategory(Integer categoryId);
     DtoCategory getCategoryById(Integer categoryId);
     List<DtoCategory> getAllCategory();
}
