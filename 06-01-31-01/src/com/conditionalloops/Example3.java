package com.conditionalloops;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) 
	
	{

        int start, end;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter start value: ");
		start = scanner.nextInt();
		
		System.out.println("Enter end value: ");
		end = scanner.nextInt();
		
		System.out.println("-----------");
		
		for(int x = start; x <= end; x++)
		{
			System.out.println(x);
			
		}
		
		scanner.close();
		
	}

		
}
