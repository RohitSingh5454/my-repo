package com.example.blogApplication.service.serviceImpl;

import com.example.blogApplication.entity.Category;
import com.example.blogApplication.entity.Post;
import com.example.blogApplication.entity.User;
import com.example.blogApplication.exception.ResourceNotFoundException;
import com.example.blogApplication.payloads.DtoPost;
import com.example.blogApplication.payloads.postResponse;
import com.example.blogApplication.repository.categoryRepository;
import com.example.blogApplication.repository.postRepository;
import com.example.blogApplication.repository.userRepository;
import com.example.blogApplication.service.categoryService;
import com.example.blogApplication.service.postService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.aspectj.weaver.AjAttribute;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class postServiceImpl implements postService {
    @Autowired
    private categoryRepository categoryRepository;
    @Autowired
    private postRepository postRepository;
    @Autowired
    private userRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public DtoPost createPost(DtoPost dtoPost, Integer userId, Integer categoryId) {
        User user =this.userRepository.findById(userId).
                orElseThrow(()->new ResourceNotFoundException("user","user id",userId));
        Category category=this.categoryRepository.findById(categoryId).
                orElseThrow(()->new ResourceNotFoundException("Category","Category id",categoryId));
        Post post=this.modelMapper.map(dtoPost, Post.class);
        post.setCategory(category);
        post.setUser(user);
        post.setImageName("default.png");
        post.setAddDate(new Date());
        Post createdPost=this.postRepository.save(post);
        return this.modelMapper.map(createdPost, DtoPost.class);
    }

    @Override
    public DtoPost updatePost(DtoPost dtoPost, Integer postId) {
        Post post=postRepository.findById(postId).
                orElseThrow(()->new ResourceNotFoundException("post","post id",postId));
        post.setContent(dtoPost.getContent());
        post.setTitle(dtoPost.getTitle());
        post.setCategory(dtoPost.getCategory());
        post.setAddDate(dtoPost.getAddDate());
        post.setImageName(dtoPost.getImageName());
        return this.modelMapper.map(post, DtoPost.class);
    }

    @Override
    public postResponse getAllPost(Integer pageNum, Integer pageSize,String sortBy,String sortDir) {
        Sort sort=(sortDir.equalsIgnoreCase("asc"))?Sort.by(sortDir).ascending():Sort.by(sortBy).descending();
       /* if (sortDir.equalsIgnoreCase("asc")){
            sort=Sort.by(sortDir).ascending();
        }
        else {
            sort=Sort.by(sortBy).descending();
        }*/
        Pageable p= PageRequest.of(pageNum,pageSize, sort);
        Page<Post> pagePost=this.postRepository.findAll(p);
      List<Post> posts= pagePost.getContent();
      List<DtoPost> listOfDtoPost=posts.stream().map((post)->this.modelMapper.map(post,DtoPost.class)).collect(Collectors.toList());
     postResponse response=new postResponse();
     response.setContent(listOfDtoPost);
     response.setPageNumber(pagePost.getNumber());
     response.setPageSize(pagePost.getSize());
     response.setTotalElement(pagePost.getTotalElements());
     response.setTotalPages(pagePost.getTotalPages());
     response.setLastPage(pagePost.isLast());
      return response;
    }

    @Override
    public String deletePostById(Integer postId) {
       Post post= postRepository.findById(postId).orElseThrow(()->new ResourceNotFoundException("post","post id",postId));
         this.postRepository.delete(post);
          return "post deleted";
    }

    @Override
    public DtoPost getPostById(Integer postId) {
        Post postById=postRepository.findById(postId).orElseThrow(()->new ResourceNotFoundException("post","post id",postId));
        DtoPost dtoPost=this.modelMapper.map(postById, DtoPost.class);
        return dtoPost;
    }

    @Override
    public List<DtoPost> getPostByCategory(Integer categoryId) {
        Category cat=this.categoryRepository.findById(categoryId).
                orElseThrow(()->new ResourceNotFoundException("category","categoryId",categoryId));
        List<Post> posts=this.postRepository.findByCategory(cat);
        List<DtoPost> dtoPostcategory=posts.stream().map((post)->this.modelMapper.map(post, DtoPost.class)).
                collect(Collectors.toList());
        return dtoPostcategory;
    }

    @Override
    public List<DtoPost> getPostByUser(Integer userId) {
        User user=this.userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("user","user id",userId));
        List<Post> posts=this.postRepository.findByUser(user);
        List<DtoPost> dtoPostUser=posts.stream().map((post)->this.modelMapper.map(post, DtoPost.class)).
                collect(Collectors.toList());
        return dtoPostUser;
    }

    @Override
    public List<DtoPost> searchPost(String keyword) {
       List<Post> posts= this.postRepository.findByTitleContaining(keyword);
       List<DtoPost> dtoPostList=posts.stream().map((post)->this.modelMapper.map(post, DtoPost.class)).
               collect(Collectors.toList());
       return dtoPostList;
    }

}
