package com.execrises;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

		int day;
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("enter day:");
		
		day = scanner.nextInt();
		
		switch(day)
		
		{
		
		case 1: 
			System.out.println("working day");
			break;
			
		case 2: 
			System.out.println("working day");
			break;
			
		case 3: 
			System.out.println("working day");
			break;

		case 4: 
			System.out.println("working day");
			break;
			
			
		case 5: 
			System.out.println("working day");
			break;

		case 6: 
			System.out.println("weekend");
			break;
			
		case 7: 
			System.out.println("weekend");
			break;



		default:
			System.out.println("invalid day");
			
			
		
		}
		
		
		scanner.close();
		
		
		
		
	}

}
