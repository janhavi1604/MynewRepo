package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.controller","com.service"})

@EntityScan("com.model")
@EnableJpaRepositories("com.repository")
public class DemoJpiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpiApplication.class, args);
	}

}
