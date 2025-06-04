package com.example.blogApplication.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer postId;
    @Column(name = "title",length = 100,nullable = false)
    private String title;
    private String content;
    private String imageName;
    private Date addDate;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User user;

    public Post() {
    }

    public Post(Integer postId, String title, String content, String imageName, Date addDate, Category category, User user) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.imageName = imageName;
        this.addDate = addDate;
        this.category = category;
        this.user = user;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
