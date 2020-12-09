package com.example.servicedicoveryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDicoveryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDicoveryAppApplication.class, args);
	}

}
