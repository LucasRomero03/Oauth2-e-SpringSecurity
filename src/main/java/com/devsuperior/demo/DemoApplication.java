package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.demo.repositories.UserRepository;
import com.devsuperior.demo.services.UserService;

@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {
  @Autowired
	private UserService userService;
	@Autowired 
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(userService.loadUserByUsername("maria@gmail.com"));
	System.out.println(userRepository.searchUserAndRolesByEmail1("alex@gmail.com"));
	}


}
