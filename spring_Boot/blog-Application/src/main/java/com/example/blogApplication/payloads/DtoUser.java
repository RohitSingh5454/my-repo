package com.example.blogApplication.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class DtoUser {
    private int id;
    @NotBlank
    @Size(min = 4,max = 9,message = "name should be of min 4 chars and max 9 chars")
    private String name;
    @Email(message = "should be a valid email")
    private String email;
    @NotBlank(message = "password cannot be null or empty")
    private String password;
    @NotBlank(message = "about cannot be null or empty")
    private String about;

    public DtoUser() {
    }

    public DtoUser(int id, String name, String email, String password, String about) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.about = about;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}


