package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		
		number =  scanner.nextInt();
		
	    System.out.println("===================");
	    
	    
	    System.out.println(number);
	    
	    scanner.close();
	    
	    
		}

}
