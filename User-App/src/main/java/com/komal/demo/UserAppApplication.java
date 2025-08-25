package com.komal.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.komal.demo.entites.User;
import com.komal.demo.repository.UserRepository;

@SpringBootApplication
public class UserAppApplication implements ApplicationRunner {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(UserAppApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(null, "Gowtham", "gow@gmail.com");
		userRepository.save(u1);
		
		User u2 = new User(null, "Rao", "Rao@gmail.com");
		userRepository.save(u2);
		
		User u3 = new User(null, "Surya", "surya@gmail.com");
		userRepository.save(u3);
		
		User u4 = new User(null, "Ravi", "ravi@gmail.com");
		userRepository.save(u4);
	}

}
