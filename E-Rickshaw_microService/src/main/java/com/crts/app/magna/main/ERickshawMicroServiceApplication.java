package com.crts.app.magna.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan
@SpringBootApplication
public class ERickshawMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ERickshawMicroServiceApplication.class, args);
		System.out.println("Micro Service Started");
	}

}
