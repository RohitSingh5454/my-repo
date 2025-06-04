package com.example.OaathImplementation;

import com.example.OaathImplementation.entity.User;
import com.example.OaathImplementation.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class OaathImplementationApplication implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
	@PostConstruct
	public void addList(){
		List<User> list=Stream.of(
				new User(1,"Hello@123","Hello@gmail.com","HelloWorld"),
						new User(2,"Manoj@786","manoj@gmail.com","manoj098"),
					new User(3,"Sakham901","saksham@gmail.com","saksha34J")	)
				.collect(Collectors.toList());
		userRepository.saveAll(list);
	}

	public static void main(String[] args) {
		SpringApplication.run(OaathImplementationApplication.class, args);
	}
	@Bean
	public PasswordEncoder passwordEncoder(){
		return NoOpPasswordEncoder.getInstance();
	}


	@Override
	public void run(String... args) throws Exception {

	}
}
