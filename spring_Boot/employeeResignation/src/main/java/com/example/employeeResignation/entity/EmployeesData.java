package com.example.EmployeesDataResignation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.web.WebProperties;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeesData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int leave;
    private String department;
    private int age;
    private String name;
}
