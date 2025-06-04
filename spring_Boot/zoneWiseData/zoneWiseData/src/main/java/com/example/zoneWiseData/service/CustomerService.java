package com.example.zoneWiseData.service;

import com.example.zoneWiseData.entity.Customer;

import java.util.List;

public interface CustomerService {
    String saveCustomer(Customer customer);
    List<Customer> getAllCustomer();
    Customer getCustomer(Integer id);
    String SaveAllCustomer(List<Customer> customers);
    List<Customer> getCustomerByZoneCode(String zoneCode);

}
