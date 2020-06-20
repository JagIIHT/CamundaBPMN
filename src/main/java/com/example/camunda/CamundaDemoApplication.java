package com.example.camunda;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class CamundaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamundaDemoApplication.class, args);
	}

}
