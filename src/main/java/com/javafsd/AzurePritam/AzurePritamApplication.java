package com.javafsd.AzurePritam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class AzurePritamApplication {
	
	@GetMapping("/")
	public String helloAzure() {
		return "Hello! Welcome to Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzurePritamApplication.class, args);
	}

}