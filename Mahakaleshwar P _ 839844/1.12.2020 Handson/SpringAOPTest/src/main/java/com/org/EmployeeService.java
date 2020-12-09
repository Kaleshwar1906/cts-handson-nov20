package com.org;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	public void store() {
		System.out.println("store() method in AOPService");
	}
	
	public void delete(int a) {
		System.out.println("delete() method in AOPService " +a);
	}
	
	public void delete1(int a) {
		System.out.println("delete() method in AOPService " +a);
	}
	
	public void getEmployees(int a, String b) {
		System.out.println("getEmp values "+a+" "+b);
	}
	
	public String display(String a) {
		return a;
	}

}
