package com.example.demoCompositeKey.service;

import com.example.demoCompositeKey.entity.EmployeesData;
import com.example.demoCompositeKey.entity.EmployeesDataId;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeesDataService {
    EmployeesData saveEmployeesData(EmployeesData EmployeesData);
    EmployeesData getEmployeesData(EmployeesDataId empId);
    List<EmployeesData> getAllEmployeesData();
    List<EmployeesData> findByName(String name);
    List<EmployeesData> getAllUsingJpql();
    List<EmployeesData> getEmployeesDataByCityUsingJpql(String city);
    List<EmployeesData> getEmployeesDataByNameUsingJpql(String name);
    List<EmployeesData> getEmployeesDataByNameOrCityUsingJpql(String name,String city);
    List<EmployeesData> getAllEmployeesDataUsingNativeQuery();
}
