package com.org;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTest {

@Before("execution(public void com.org.AspectService.store())")
public void beforeLog() {
	System.out.println("BeforeLog");
}

@After("execution(public void com.org.AspectService.store())")
public void afterLog() {
	System.out.println("AfterLog");
}
}
