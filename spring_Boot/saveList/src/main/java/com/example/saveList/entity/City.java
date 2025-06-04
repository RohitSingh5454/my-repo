package com.example.saveList.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "city_name")
    private String name;
    @Column(name = "city_Threshold")
    private double threshold;

    public City() {
    }

    public City(int id, String name, double threshold) {
        this.id = id;
        this.name = name;
        this.threshold = threshold;
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

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }
}
