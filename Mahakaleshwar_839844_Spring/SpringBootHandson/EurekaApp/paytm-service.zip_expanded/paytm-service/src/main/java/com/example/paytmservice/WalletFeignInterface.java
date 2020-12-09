package com.example.paytmservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ACCOUNT-SERVICE")
public interface WalletFeignInterface {
	
	@GetMapping(value="/account/{accountNo}", consumes="application/json")
	public AccountStructure getAmount(@PathVariable("accountNo") long accountNo);
}
