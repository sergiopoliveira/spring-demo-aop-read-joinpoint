package com.sergio.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		FootballCoach footyCoach1 = context.getBean("myFootballCoach", FootballCoach.class);
		
		FootballCoach footyCoach2 = context.getBean("myFootballCoach", FootballCoach.class);
		
		//check if they are same footyCoach
		boolean resultFooty = (footyCoach1 == footyCoach2);
		System.out.println(resultFooty);
		
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object? " + result);
		
		System.out.println("Memory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		//close the context
		context.close();

	}

}


