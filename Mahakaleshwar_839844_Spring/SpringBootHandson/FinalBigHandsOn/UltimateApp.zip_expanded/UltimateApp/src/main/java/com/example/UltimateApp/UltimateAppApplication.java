package com.example.UltimateApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UltimateAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(UltimateAppApplication.class, args);
	}

}
