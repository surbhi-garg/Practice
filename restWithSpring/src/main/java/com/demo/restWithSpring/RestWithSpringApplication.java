package com.demo.restWithSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.demo.restWithSpring.*")
@SpringBootApplication
public class RestWithSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestWithSpringApplication.class, args);
	}

}
