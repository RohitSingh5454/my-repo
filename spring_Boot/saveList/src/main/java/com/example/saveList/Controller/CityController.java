package com.example.saveList.Controller;

import com.example.saveList.Service.CityService;
import com.example.saveList.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/getApi")
public class CityController {
    @Autowired
    private CityService cityService;
    @GetMapping("/getCity/{threshold}")
    public ResponseEntity<List<String>> getByThreshold(@PathVariable Double threshold){
        List<String> list=cityService.getByThreshold(threshold);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
