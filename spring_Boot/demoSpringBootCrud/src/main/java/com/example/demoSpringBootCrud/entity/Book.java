package com.example.demoSpringBootCrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book_details")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name = "summary")
    private String summary;
    @Column(name = "price")
    private double price;

    public Book() {
    }

    public Book(int id, String name, String summary, double price) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.price = price;
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
