package com.example.blogApplication.controller;

import com.example.blogApplication.payloads.DtoCategory;
import com.example.blogApplication.service.serviceImpl.categoryServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/categories")
public class categoryController {
    @Autowired
    private categoryServiceImpl categoryService;
    @PostMapping("/saveCategory")
    public ResponseEntity<DtoCategory> createCategory(@Valid @RequestBody DtoCategory dtoCategory){
        DtoCategory create=this.categoryService.createCategory(dtoCategory);
        return new ResponseEntity<DtoCategory>(create, HttpStatus.CREATED);
    }
    @PutMapping("/updateCategory/{categoryId}")
    public ResponseEntity<DtoCategory> updateCategory(@Valid @RequestBody DtoCategory dtoCategory, @PathVariable Integer categoryId){
        DtoCategory dtoUpdate=this.categoryService.updateCategory(dtoCategory,categoryId);
        return new ResponseEntity<>(dtoUpdate,HttpStatus.OK);
    }
    @DeleteMapping("/deleteById/{categoryId}")
    public ResponseEntity<?> deleteCategory(@PathVariable Integer categoryId){
        this.categoryService.deleteCategory(categoryId);
        return new ResponseEntity<>(Map.of("message","Category deleted successfull"),HttpStatus.OK);
    }
    @GetMapping("/getCategory/{categoryId}")
    public ResponseEntity<DtoCategory> getById(@PathVariable Integer categoryId){
       DtoCategory getCategory=this.categoryService.getCategoryById(categoryId);
       return new ResponseEntity<>(getCategory,HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<DtoCategory>> getAllCategory(){
       List<DtoCategory> dtoCategoryList=this.categoryService.getAllCategory();
       return new ResponseEntity<>(dtoCategoryList,HttpStatus.OK);
    }

}
