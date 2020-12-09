package com.example.paytmservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class PaytmServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmServiceApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate createRestTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

}
