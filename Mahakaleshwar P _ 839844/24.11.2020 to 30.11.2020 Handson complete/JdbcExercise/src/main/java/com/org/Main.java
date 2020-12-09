package com.org;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		List<Employee> list = service.fetchAllEmployees();
		list.forEach(e -> System.out.println(e));
	}
}
