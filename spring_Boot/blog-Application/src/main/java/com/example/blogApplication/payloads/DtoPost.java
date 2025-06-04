package com.example.blogApplication.payloads;

import com.example.blogApplication.entity.Category;
import com.example.blogApplication.entity.User;

import java.util.Date;

public class DtoPost {
    private String title;
    private String content;
    private String imageName;
    private Date addDate;
    private Category category;
    private User user;

    public DtoPost() {
    }

    public DtoPost(String title, String content, String imageName, Date addDate, Category category, User user) {
        this.title = title;
        this.content = content;
        this.imageName = imageName;
        this.addDate = addDate;
        this.category = category;
        this.user = user;
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
