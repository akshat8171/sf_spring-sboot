package com.examples.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println("Hello World");		
		
		// Create Greetings object and access the message
//		Greetings greetings = new Greetings();
//		System.out.println(greetings.getMessage());
		
		// STEP 1: Create IoC container
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		
		System.out.println("IoC Container: " + ctx);
		
		System.out.println("Bean count: " + ctx.getBeanDefinitionCount());
		
		// STEP 2: Access beans
		Greetings greetings1 = ctx.getBean("greetings1", Greetings.class);
		System.out.println(greetings1.getMessage());
		
		Greetings greetings2 = ctx.getBean("greetings2", Greetings.class);
		System.out.println(greetings2.getMessage());
		
		// STEP 3: Shutdown container
		ctx.registerShutdownHook();
	}

}
