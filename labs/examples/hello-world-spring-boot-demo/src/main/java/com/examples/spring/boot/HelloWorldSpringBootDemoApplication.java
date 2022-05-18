package com.examples.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// @ComponentScan, @Configuration, @EnableAutoConfiguration
public class HelloWorldSpringBootDemoApplication implements CommandLineRunner{

	@Autowired
	ApplicationContext ctx;
	
	public HelloWorldSpringBootDemoApplication() {
		System.out.println("Context: " + ctx);
	}
	
	public static void main(String[] args) {	
		System.out.println("Launching Spring Boot App...");
		// Launch Spring Boot App
		SpringApplication.run(HelloWorldSpringBootDemoApplication.class, args);
		// Creates IoC Container
		// Register Beans and does wiring
		System.out.println("Hello Spring Boot!!!");

	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Context: " + ctx);
		
		System.out.println("No of beans: " + ctx.getBeanDefinitionCount());
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}		
		
		Greetings greetings = ctx.getBean("greetings", Greetings.class);
		greetings.getMessage();
	}
	
//	@Bean
//	public Greetings greetings() {
//		return new Greetings("Welcome to Spring Boot Training!!!");
//	}		

}
