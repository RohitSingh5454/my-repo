package com.example.zoneWiseData.repository;

import com.example.zoneWiseData.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
     List<Customer> getCustomerByZoneCode(String zoneCode);
}
