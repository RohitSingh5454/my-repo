package com.example.saveList.Service;

import com.example.saveList.Repository.CityRepository;
import com.example.saveList.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public List<String> getByThreshold(Double threshold){
        return cityRepository.findCityByThreshold(threshold).stream()
                .filter(i->i.getThreshold()>50).map(City::getName).collect(Collectors.toList());
    }
}
