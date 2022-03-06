package com.careerdevs.Jsonplaceholder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JsonplaceholderApplication {

	@GetMapping ("/")
	public String rootRoute () {
		return "You are Home";
	}

	public static void main(String[] args) {

		SpringApplication.run(JsonplaceholderApplication.class, args);
	}

}
