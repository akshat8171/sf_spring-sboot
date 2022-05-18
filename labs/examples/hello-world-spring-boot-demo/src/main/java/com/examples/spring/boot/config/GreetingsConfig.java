package com.examples.spring.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.examples.spring.boot.Greetings;

@Configuration
public class GreetingsConfig {
	@Bean
	@Lazy
	@Scope("singleton")
	public Greetings greetings() {
		return new Greetings("Welcome to Spring Framework Training :) - Java based configuration example");
	}
	
	@Bean
	@Scope("prototype")
	public Greetings greetings1() {
		return new Greetings("Welcome to Spring Framework Training :) - Greeting #1");
	}
	
	// <bean id="greetings" class="com.examples.spring.core.Greetings" />
}