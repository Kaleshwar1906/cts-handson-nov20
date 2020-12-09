package com.org;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectTest {
	
	@After("execution(public * com.org.EmployeeService.store())")
	public void log() {
		System.out.println("In the log() method in AOP class");
	}
	
	@Before("execution(public * com.org.EmployeeService.*(int))")
	public void demo1(){
		System.out.println("The method called by methods with only one int parameter");
	}
	
	@Before("execution(public void com.org.EmployeeService.*(int,String))")
	public void demo2() {
		System.out.println("The method with int and String paramters");
	}
	
	@Before("execution(public void com.org.EmployeeService.*(int,*))")
	public void demo3() {
		System.out.println("The method for 2 parameters => int and any other");
	}
	
	@Before("execution(public String com.org.EmployeeService.*(..))")
	public void demo4() {
		System.out.println("method to return only string");
	}

}
