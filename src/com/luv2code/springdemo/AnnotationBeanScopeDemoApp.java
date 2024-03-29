package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		System.out.println("Pointing the same object: " + result);
		System.out.println("Memory location of theCoach: " + theCoach);
		System.out.println("Memory location of alphaCoach:" + alphaCoach);
		
		// close container
		context.close();

	}

}
