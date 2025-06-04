package com.example.zoneWiseData.service;

import com.example.zoneWiseData.entity.Customer;
import com.example.zoneWiseData.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public String saveCustomer(Customer customer) {
        customerRepository.save(customer);
        return "Data saved";
    }

    @Override
    public Customer getCustomer(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public String SaveAllCustomer(List<Customer> customers) {
       customerRepository.saveAll(customers);
       return "list of customer saved";
    }

    @Override
    public List<Customer> getCustomerByZoneCode(String zonalCode) {
        return customerRepository.getCustomerByZoneCode(zonalCode);
    }
}
