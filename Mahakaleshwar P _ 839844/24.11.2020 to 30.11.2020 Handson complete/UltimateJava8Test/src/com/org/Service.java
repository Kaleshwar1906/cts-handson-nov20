package com.org;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Service {
	List<Account> list=new ArrayList<Account>();
	
	Scanner in =new  Scanner(System.in);
	public void addAccount(Account ob) throws AccountExistsException {
		boolean f=check(ob.getAccountNumber());
		
		if(f)
			list.add(ob);
		else
			throw new AccountExistsException("Account already exists.");
		
	}
	
	public void removeAccount(int accountNumber) throws AccountNotFoundException {
		boolean f=check(accountNumber);
		Account ob=null;
		if(!f)
		{ 
			for(Account item: list) {
				if(item.getAccountNumber()==accountNumber) {
					ob=item;
				}
			}
			list.remove(ob);
		}
		else
			throw new AccountNotFoundException("Account not Found.");
	}
	
	public Account search(int accountNumber) throws AccountNotFoundException
	{
		boolean f=check(accountNumber);
		Account ob=null;
		int i=0;
		if(!f) {
			for(Account item: list) {
				if(item.getAccountNumber()==accountNumber) {
					ob=item;
				}
			}
			return ob;
		}
		else {
			throw new AccountNotFoundException("Account not Found.");
		}
	}
	public List<Account> display(){
		return list;
	}
	
	public List<Account> specificDisplay(){
		List<Account> checkList = list.stream().filter(item->item.getBalance()<1000).collect(Collectors.toList());
		return checkList;
	}

	public boolean check(int n) {
		boolean f=true;
		for(Account item: list) {
			if(item.getAccountNumber()==n)
				f=false;
		}
		return f;
	}
}
