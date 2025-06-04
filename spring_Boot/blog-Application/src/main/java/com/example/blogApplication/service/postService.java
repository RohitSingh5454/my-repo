package com.example.blogApplication.service;

import com.example.blogApplication.entity.Post;
import com.example.blogApplication.payloads.DtoPost;
import com.example.blogApplication.payloads.postResponse;

import java.util.List;

public interface postService {
    DtoPost createPost(DtoPost dtoPost,Integer userId,Integer categoryId);
    DtoPost updatePost(DtoPost dtoPost,Integer postId);
    postResponse getAllPost(Integer pageNum, Integer pageSize,String sortBy,String sortDir);
    String deletePostById(Integer postId);
    DtoPost getPostById(Integer postId);
    List<DtoPost> getPostByCategory(Integer categoryId);
    List<DtoPost> getPostByUser(Integer userId);
    List<DtoPost> searchPost(String keyword);
}
