package com.examples;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Account> set = new HashSet<Account>();
		LocalTime before = LocalTime.now();
		for(int i = 1; i <= 20000; i++) {
			Account account = new Account(i, "Test "+i);
			set.add(account);
			System.out.println("Adding item to the set: "+i);
		}
		LocalTime after = LocalTime.now();
		System.out.println("Time taken: "+Duration.between(before, after).toMillis());
		
	}

}
