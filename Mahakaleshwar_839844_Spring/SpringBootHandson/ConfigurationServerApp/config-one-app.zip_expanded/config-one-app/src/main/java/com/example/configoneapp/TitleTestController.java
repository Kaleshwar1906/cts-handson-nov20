package com.example.configoneapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class TitleTestController {
	
	@Value("${title: No title found}")
	private String message;
	
	@GetMapping
	public String getMessage() {
		return message;
	}
}
