package com.example.demoSpringBootCrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name="user_data")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int uid;
    private String uname;
    private String email;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uc_id",referencedColumnName = "id")
    private Book book;
    public User() {
    }

    public User(int uid, String uname, String email) {
        this.uid = uid;
        this.uname = uname;
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
