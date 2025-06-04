package com.example.zoneWiseData.entity;

import jakarta.persistence.*;

@Entity
@Table(name="t_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String zoneCode;
    private String region;
    private String state;
    private String city;

    public Customer() {
    }

    public Customer(int id, String zoneCode, String region, String state, String city) {
        this.id = id;
        this.zoneCode = zoneCode;
        this.region = region;
        this.state = state;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZoneCode() {
        return zoneCode;
    }

    public void setZoneCode(String zoneCode) {
        this.zoneCode = zoneCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
