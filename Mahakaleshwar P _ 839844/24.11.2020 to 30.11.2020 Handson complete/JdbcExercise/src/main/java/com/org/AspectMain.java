package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMain {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-beans.xml");
		AspectService as=(AspectService) ctx.getBean("aspectService");
		as.store();
	}
}
