package com.example.EmployeesDataResignation;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class EmployeesDataResignationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesDataResignationApplication.class, args);
	}
   @Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
   }
}
