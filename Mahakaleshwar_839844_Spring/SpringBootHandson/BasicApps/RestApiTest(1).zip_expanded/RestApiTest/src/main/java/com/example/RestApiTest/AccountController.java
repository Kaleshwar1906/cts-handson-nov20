package com.example.RestApiTest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/account")
public class AccountController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String hello() {
		return "Hello"; 
	}
	
	@RequestMapping(value = "details", method = RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public Account getAccount() {
		// you need to call the database 
		Account account = new Account(448590, 20000, "IFSC12345");
		return account;
	}
	
	@RequestMapping(value = "debit/{accountNumber}/{amount}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)   
	public Account debit(@PathVariable("accountNumber") int accountNumber, @PathVariable("amount") double amount) {
		Account account = new Account(accountNumber, amount, "IFSC");
		return account;
	}
}
