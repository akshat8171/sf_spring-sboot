package com.examples.spring.boot;

public class Greetings {
	private String message;
	
	// default constructor
	public Greetings()
	{
		
	}
	
	// creates Greetings object with message property
	public Greetings(String message)
	{
		this.message = message;
	}
	
	// creates Greetings object with message property
	public Greetings(String message1, String message2, Integer id)
	{
		this.message = message1 + " " + message2 + " " + id;
	}	

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {

		System.out.println("Your Message : " + message);
	}
	
	public void init()
	{
		System.out.println("Bean getting initialized..");
	}
	
	public void cleanup()
	{
		System.out.println("Bean getting destroyed");
	}
}