package com.iss.ownwork.firstdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstdemoApplication.class, args);
	}

@Bean
public CommandLineRunner commandLineRunner(ApplicationContext ctx) {	
	return args -> {
		User u1 = new User("1", "Suria", "Too fast");
		System.out.println(u1.toString());
	
};
}
}
