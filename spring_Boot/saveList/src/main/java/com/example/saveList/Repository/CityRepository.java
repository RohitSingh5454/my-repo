package com.example.saveList.Repository;

import com.example.saveList.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CityRepository extends JpaRepository<City,Integer> {
   @Query("SELECT c FROM City c WHERE c.threshold > :threshold")
   List<City> findCityByThreshold(Double threshold);
}
