package com.javaidentifiers;

import java.util.Scanner;

public class Arithmaticoperator {

	public static void main(String[] args) {

	//declare variables	
		int a;
		int b;
		
       //create a scanner class object
		Scanner s = new Scanner(System.in);
		
		//input two numbers from user
		System.out.println("Enter first number :");
		 a = s.nextInt();
		
		System.out.println("Enter second number :");
		 b = s.nextInt();
		
		//perform Arithmetic operations
		int sum = a+b;
		int sub = a-b;
		int product = a*b;
		int division = a/b;
		int module = a%b;
		
		//print result to console
		System.out.println("sum   ="          +sum);
		System.out.println("sub    ="          +sub); 
        System.out.println("product ="      +product);
	    System.out.println("division ="     +division);
	   System.out.println("module    ="        +module);
	
	
	
	}
	
	
	

}
