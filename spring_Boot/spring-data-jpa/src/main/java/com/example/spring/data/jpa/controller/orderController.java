package com.example.spring.data.jpa.controller;

import com.example.spring.data.jpa.dto.orderRequest;
import com.example.spring.data.jpa.entity.Customer;
import com.example.spring.data.jpa.repository.customerRepository;
import com.example.spring.data.jpa.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class orderController {
    @Autowired
    private customerRepository customerRepository;
    @Autowired
    private productRepository productRepository;
    @PostMapping("/saveOrder")
    public Customer placeOrder(@RequestBody orderRequest request){
        return customerRepository.save(request.getCustomer());
    }
    @GetMapping("/getAll")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }

}
