package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx =new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service=(EmployeeService) ctx.getBean("employeeService");
		service.store();
		service.getEmployees(20,"Hello");
		service.delete(2);
		service.delete1(0);
		System.out.println("The string is "+service.display("Unknown User"));

	}

}
