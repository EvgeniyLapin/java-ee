package com.senla.lapin.task1;

import java.util.Random;

public class Task1{
	
	public static void main(String[] args) {
		
		int x = new Random().nextInt(899) + 100;//generate random	
		
		sumFinder(x);
			
	}
	
	static void sumFinder(int x) {
		
		int a = x/100;
		int b =(x/10)%10;
		int c = x%10;
		
		System.out.println("Number: " + x);
		System.out.println("Digits: " + a  + ", " + b  + ", " + c );
		System.out.println("Sum: " + (a + b + c));
	}

}
