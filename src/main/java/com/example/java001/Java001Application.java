package com.example.java001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Java001Application {

	@GetMapping("/mensaje")
	public String mensaje() {
		return "Welcome from Java to Azure";
	}

	public static void main(String[] args) {
		SpringApplication.run(Java001Application.class, args);
	}

}
