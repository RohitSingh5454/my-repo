package com.example.demoCompositeKey.controller;

import com.example.demoCompositeKey.entity.EmployeesData;
import com.example.demoCompositeKey.repository.EmployeesDataRepository;

import com.example.demoCompositeKey.service.serviceImpl.EmployeesDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empHit")
public class EmployeesDataController {
    @Autowired
    EmployeesDataServiceImpl EmployeesDataService;
    @PostMapping("/saveEmp")
    public EmployeesData saveEmployeesData(@RequestBody EmployeesData EmployeesDatas){
        return EmployeesDataService.saveEmployeesData(EmployeesDatas);
    }
    @GetMapping("/getUsingJpql")
    public List<EmployeesData> getAllUsersUsingJpql(){
        return EmployeesDataService.getAllUsingJpql();
    }
    @GetMapping("/getEmployeesDataByCityUsingJpql/{city}")
    public List<EmployeesData> getEmployeesDataByCityUsingJpql(@PathVariable String city) {
        return EmployeesDataService.getEmployeesDataByCityUsingJpql(city);
    }
    @GetMapping("/getByName/{name}")
    public List<EmployeesData> findByName(@PathVariable String name){
        return EmployeesDataService.findByName(name);
    }
    @GetMapping("/getByNameUsingJpql/{name}")
    public List<EmployeesData> findByNameUsingJpql(@PathVariable String name){
        return EmployeesDataService.getEmployeesDataByNameUsingJpql(name);
    }
    @GetMapping("/getEmployeesDataByNameOrCityUsingJpql/{name}/{city}")
    public List<EmployeesData> findByNameOrCityUsingJpql(@PathVariable String name,@PathVariable String city){
        return EmployeesDataService.getEmployeesDataByNameOrCityUsingJpql(name,city);
    }
    @GetMapping("/getAllEmployeesDataUsingNative")
    public List<EmployeesData> findAllEmployeesDataUsingNative(){
        return EmployeesDataService.getAllEmployeesDataUsingNativeQuery();
    }
}
