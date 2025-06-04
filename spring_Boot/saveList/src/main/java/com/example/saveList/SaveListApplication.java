package com.example.saveList;

import com.example.saveList.Repository.CityRepository;
import com.example.saveList.entity.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaveListApplication implements CommandLineRunner {
	@Autowired
	private CityRepository cityRepository;
	private final static Logger log=LoggerFactory.getLogger(SaveListApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SaveListApplication.class, args);
       for (int i=0;i<100;i++){
		   System.out.println("This is a just a message "+i);
	   }
	}

	@Override
	public void run(String... args) throws Exception {
		cityRepository.save(new City(1,"New York", 45.0));
		cityRepository.save(new City(2,"Los Angeles", 55.0));
		cityRepository.save(new City(3,"Chicago", 60.0));
		cityRepository.save(new City(4,"Houston", 50.0));
		cityRepository.save(new City(5,"Phoenix", 70.0));
	}
}
