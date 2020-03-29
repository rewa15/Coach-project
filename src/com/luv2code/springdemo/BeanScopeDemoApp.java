package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Load the spring configuration file
		
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        
        // 2. Retrieve the bean
        
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach alphaCoach = context.getBean("myCoach",Coach.class);
        
        System.out.println(theCoach == alphaCoach);
        System.out.println(theCoach);
        System.out.println(alphaCoach);
        
        context.close();
	}

}
