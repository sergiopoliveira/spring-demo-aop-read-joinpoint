package com.sergio.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private final static String[] arrayRandom = new String[3];
	Random rand = new Random();
	
	static {
		arrayRandom[0] = "Not your lucky day...";
		arrayRandom[1] = "Fortunate day for you...";
		arrayRandom[2] = "Today is a great day!";
	}




	@Override
	public String getFortune() {
		
		//generate number from 0 to 2
		int n = rand.nextInt(2); 
		return arrayRandom[n];
	}

}
