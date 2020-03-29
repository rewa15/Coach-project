package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// 1. Load the spring configuration file
		
	   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	   
	// 2. Retrieve bean from spring container
		
	   CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
	   
	   System.out.println(theCoach.getDailyWorkout());
	   System.out.println(theCoach.getDailyFortune());
	   System.out.println(theCoach.getEmailAddress());
	   System.out.println(theCoach.getTeam());
	   
	   context.close();
	}

}
