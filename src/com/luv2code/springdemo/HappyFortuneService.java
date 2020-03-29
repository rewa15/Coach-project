package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {

	String[] arr = {"Lucky day", "Unlucky day", "Favourable day"};
	@Override
	public String getFortune(){
	    
		int n = (int) ((int)3*Math.random());
		return arr[n];	
	}

}
