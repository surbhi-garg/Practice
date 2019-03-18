package com.spring.springBootDemo;

import com.spring.springBootDemo.entities.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringBootDemoApplication {
	@Bean
	Users user()
	{
		Users user=new Users();
		user.setUsername("surbhi.garg@tothenew.com");
		user.setPassword("Hello");
		return user;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
