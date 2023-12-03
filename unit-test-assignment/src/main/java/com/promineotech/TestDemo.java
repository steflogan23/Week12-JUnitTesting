package com.promineotech;

import java.util.Random;

public class TestDemo {

	public int addPositive(int a, int b) {
		if (a > 0 && b > 0) {
			return a + b; 
		} else
				throw new IllegalArgumentException("Both parameters must be positive!");
		
}
	//Method to average 3 numbers
	public int avgNum(int a, int b, int c) {
		if (a > 0 && b > 0 && c > 0) {
			return ((a + b + c)/3);
		}
		else
			throw new IllegalArgumentException("All parameters must be positive.");
	}
	
	
	
	
	
	
	
	
	
	public int randomNumberSquared() {
		int base = getRandomInt();
		return base * base;
		}
	int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
	

		
	}
	


