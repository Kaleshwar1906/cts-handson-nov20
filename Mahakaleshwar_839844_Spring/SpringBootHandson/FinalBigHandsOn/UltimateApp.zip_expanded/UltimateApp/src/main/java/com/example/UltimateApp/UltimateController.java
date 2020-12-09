package com.example.UltimateApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ultimate")
public class UltimateController {

	@Autowired
	private CustomerService cs;
	
	
}
