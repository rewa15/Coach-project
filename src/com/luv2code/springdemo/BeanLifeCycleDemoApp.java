package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Load the spring configuration file
		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        
        // 2. Retrieve the bean
        
        Coach theCoach = context.getBean("myCoach",Coach.class);        
        System.out.println(theCoach.getDailyWorkout());        
        context.close();
	}

}
