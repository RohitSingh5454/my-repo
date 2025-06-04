package com.example.blogApplication.controller;

import com.example.blogApplication.entity.Post;
import com.example.blogApplication.payloads.ApiResponse;
import com.example.blogApplication.payloads.DtoPost;
import com.example.blogApplication.payloads.postResponse;
import com.example.blogApplication.service.serviceImpl.postServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.blogApplication.config.appConstant;

import java.util.List;

@RestController
@RequestMapping("/Api")
public class postController {
    @Autowired
    private postServiceImpl postService;
    @PostMapping("/user/{userId}/category/{categoryId}/posts")
    public ResponseEntity<DtoPost> createPost(@RequestBody DtoPost dtoPost, @PathVariable Integer userId, @PathVariable Integer categoryId){
        DtoPost createPost=this.postService.createPost(dtoPost,userId,categoryId);
        return new ResponseEntity<>(createPost, HttpStatus.CREATED);
    }
    @PutMapping("/updatePost/{postId}")
    public ResponseEntity<DtoPost> updatePost(@RequestBody DtoPost dtoPost ,@PathVariable Integer postId)
    {
        DtoPost getPost=postService.updatePost(dtoPost,postId);
        return new ResponseEntity<>(getPost,HttpStatus.OK);
    }
    @GetMapping("/user/{userId}/posts")
    public ResponseEntity<List<DtoPost>> getPostByUser(@PathVariable Integer userId){
       List<DtoPost> post= this.postService.getPostByUser(userId);
       return new ResponseEntity<List<DtoPost>>(post,HttpStatus.OK);
    }
    @GetMapping("/category/{categoryId}/posts")
    public ResponseEntity<List<DtoPost>> getPostByCategory(@PathVariable Integer categoryId)
    {
        List<DtoPost> posts=postService.getPostByCategory(categoryId);
        return new ResponseEntity<>(posts,HttpStatus.OK);
    }
    @GetMapping("/post/{postId}")
    public ResponseEntity<DtoPost> getPostById(@PathVariable Integer postId)
    {
        DtoPost dtoPost=postService.getPostById(postId);
        return new ResponseEntity<>(dtoPost,HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<postResponse> getAllPost
            (@RequestParam (value = "pageNum",defaultValue =appConstant.PAGE_NUM ,required = false) Integer pageNum,
             @RequestParam(value = "pageSize",defaultValue = appConstant.PAGE_SIZE,required = false) Integer pageSize,
             @RequestParam(value = "sortBy",defaultValue = appConstant.SORT_BY,required = false) String sortBy,
             @RequestParam(value = "sortDir",defaultValue = appConstant.SORT_DIR,required = false) String sortDir)
    {
        postResponse postAll=postService.getAllPost(pageNum,pageSize,sortBy,sortDir);
        return new ResponseEntity<>(postAll,HttpStatus.OK);

    }
    @DeleteMapping("/delete/{postId}")
    public ApiResponse deletePostById(@PathVariable Integer postId)
    {
        this.postService.deletePostById(postId);
        return new ApiResponse("post is successfully deleted ",true);

    }
    @GetMapping("/posts/search/{keywords}")
     public ResponseEntity<List<DtoPost>> searchPostByTitle(@PathVariable("keywords") String keyword){
       List<DtoPost> posts=this.postService.searchPost(keyword);
        return new ResponseEntity<>(posts,HttpStatus.OK);
    }
}
