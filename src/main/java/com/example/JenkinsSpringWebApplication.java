package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JenkinsSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsSpringWebApplication.class, args);
	}


	@GetMapping("/")
	public String hello() {
		return "Hello world";
	}

	@GetMapping("/{name}")
	public String helloName(@PathVariable String name) {
		return "Hello " + name;
	}

}
