package com.example.zoneWiseData.controller;

import com.example.zoneWiseData.entity.Customer;
import com.example.zoneWiseData.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;
    @PostMapping
    public String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return "Customer added";
    }
    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @GetMapping("id")
    public Customer getCustomerById(@PathVariable Integer id){
        return customerService.getCustomer(id);
    }
    @PostMapping("/saveAll")
    public String saveAllCustomers(@RequestBody List<Customer> customers){
        customerService.SaveAllCustomer(customers);
        return "customers saved";
    }
    @GetMapping("getAllCustomer/{zoneCode}")
    public List<Customer> getByZonalCode(@PathVariable String zoneCode){
        return customerService.getCustomerByZoneCode(zoneCode);
    }
}
