package com.example.paytmservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WalletService {

	//@Autowired
	//private RestTemplate rest;
	
	@Autowired
	private WalletFeignInterface fc;
	
	public Wallet addAmountToWallet(long accountNumber) {
		Wallet wallet = new Wallet();
		//AccountStructure account = rest.getForObject("http://ACCOUNT-SERVICE/account/"+accountNumber, AccountStructure.class);
		AccountStructure account=fc.getAmount(accountNumber);
		wallet.setBalance(wallet.getBalance() + (account.getAmount() * 0.5));
		return wallet;
	}
	
}
