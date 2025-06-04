package com.example.EmployeesDataResignation.service;

import com.example.EmployeesDataResignation.dto.EmployeesDataDto;
import com.example.EmployeesDataResignation.dto.EmployeesDataFilterDto;
import com.example.EmployeesDataResignation.entity.EmployeesData;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeesDataService {
     String saveEmployeesData(EmployeesDataDto EmployeesDataDto);
     List<EmployeesData> getEmployeesData(Integer id);
     String deleteEmployeesData(Integer id);
     String updateEmployeesData(EmployeesDataDto EmployeesDataDto,Integer id);
     String saveListEmployeesData(List<EmployeesDataDto> EmployeesDataDtoList);
     @Scheduled(fixedRate = 10000)
     List<EmployeesData> filterEmployeesDataBasedOnAgeAndLeave();
     EmployeesDataFilterDto filterEmployeesData(Integer id);

}
