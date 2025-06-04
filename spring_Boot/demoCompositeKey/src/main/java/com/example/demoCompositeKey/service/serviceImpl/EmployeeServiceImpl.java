package com.example.demoCompositeKey.service.serviceImpl;

import com.example.demoCompositeKey.entity.EmployeesData;
import com.example.demoCompositeKey.entity.EmployeesDataId;
import com.example.demoCompositeKey.repository.EmployeesDataRepository;
import com.example.demoCompositeKey.service.EmployeesDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeesDataServiceImpl implements EmployeesDataService {
    @Autowired
    EmployeesDataRepository EmployeesDataRepository;
    @Override
    public EmployeesData saveEmployeesData(EmployeesData EmployeesData) {
       EmployeesData emp= EmployeesDataRepository.save(EmployeesData);
       return emp;
    }

    @Override
    public EmployeesData getEmployeesData(EmployeesDataId empId) {
        return EmployeesDataRepository.findById(empId).orElse(null);
    }

    @Override
    public List<EmployeesData> getAllEmployeesData() {
        return EmployeesDataRepository.findAll();
    }

    @Override
    public List<EmployeesData> getEmployeesDataByNameUsingJpql(String name) {
       return EmployeesDataRepository.getEmployeesDataByNameUsingJpql(name);
    }

    @Override
    public List<EmployeesData> getEmployeesDataByNameOrCityUsingJpql(String name, String city) {
        return EmployeesDataRepository.getEmployeesDataByNameOrCityUsingJpql(name,city);
    }

    @Override
    public List<EmployeesData> getAllEmployeesDataUsingNativeQuery() {
        return EmployeesDataRepository.getAllUserUsingNativeQuery();
    }

    @Override
    public List<EmployeesData> findByName(String name) {
        return EmployeesDataRepository.findByName(name);
    }

    @Override
    public List<EmployeesData> getAllUsingJpql() {
        return EmployeesDataRepository.getAllEmployeesDatasUsingJpql();
    }

    @Override
    public List<EmployeesData> getEmployeesDataByCityUsingJpql(String city) {
        return EmployeesDataRepository.getEmployeesDataByCityUsingJpql(city);
    }

}
