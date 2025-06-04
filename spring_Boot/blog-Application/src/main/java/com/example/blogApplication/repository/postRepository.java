package com.example.blogApplication.repository;

import com.example.blogApplication.entity.Category;
import com.example.blogApplication.entity.Post;
import com.example.blogApplication.entity.User;
import com.example.blogApplication.payloads.DtoPost;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface postRepository extends JpaRepository<Post, Integer> {
    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);
    List<Post> findByTitleContaining(String title);

}
