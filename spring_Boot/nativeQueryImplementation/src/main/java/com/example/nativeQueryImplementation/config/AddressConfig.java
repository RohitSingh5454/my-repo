package com.example.nativeQueryImplementation.config;

import com.example.nativeQueryImplementation.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {
    @Bean
    public AddressService EmployeesDataBean(){
        return new AddressService();
    }
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
