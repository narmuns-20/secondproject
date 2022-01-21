package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		int sum;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("enter first value:");
		
		num1 = scanner.nextInt();
		
		System.out.println("enter second value:");
		
		num2 = scanner.nextInt();
		
		sum  = num1+num2;
		
		System.out.println(sum);
		
		scanner.close();
		
	}

}
