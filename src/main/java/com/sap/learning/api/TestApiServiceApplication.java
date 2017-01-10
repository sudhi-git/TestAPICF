package com.sap.learning.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class TestApiServiceApplication {

	@RequestMapping("/api")
	String apiCall(){
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestApiServiceApplication.class, args);
	}
}
