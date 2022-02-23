package de.springdemo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller // not the @Controller
@SpringBootApplication
public class SpringbootApplication {

	public static void main(final String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	@RequestMapping("/hello")
	public String showHelloWorld() {
		return "hello-world";
	}

}
