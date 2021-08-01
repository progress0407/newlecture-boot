package com.newlecture.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewlecBootApplication {

	public static void main(String[] args) {
		System.out.println("_____________________ before start statement: Hello world");
		SpringApplication.run(NewlecBootApplication.class, args);
		System.out.println("_____________________ after start statement: Hello world");
	}

}
