package com.example.EmployeesDataResignation.repositoty;

import com.example.EmployeesDataResignation.entity.EmployeesData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesDataRepository extends JpaRepository<EmployeesData, Integer> {
}
