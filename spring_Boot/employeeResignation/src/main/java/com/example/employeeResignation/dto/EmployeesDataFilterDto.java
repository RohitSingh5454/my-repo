package com.example.EmployeesDataResignation.dto;

import lombok.Data;

@Data
public class EmployeesDataFilterDto {
    private int id;
    private int leave;
    private String department;
    private int age;
}
