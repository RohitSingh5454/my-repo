package com.example.spring.data.jpa.dto;

import com.example.spring.data.jpa.entity.Customer;
public class orderRequest {
    private Customer customer;

    public orderRequest() {
    }

    public orderRequest(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
