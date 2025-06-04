package com.example.EmployeesDataResignation.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EmployeesDataDto {
    private int id;
    private int leave;
    private String department;
    private int age;
    private String name;
}
