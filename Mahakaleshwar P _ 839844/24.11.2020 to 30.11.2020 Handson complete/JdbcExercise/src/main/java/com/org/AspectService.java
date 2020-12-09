package com.org;

import org.springframework.stereotype.Service;

@Service
public class AspectService {

	public void store() {
		System.out.println("Store method in Service");
	}
}
