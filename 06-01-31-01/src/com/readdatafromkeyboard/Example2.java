package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter your name:");
		
		name = scanner.nextLine();
		
		System.out.println("==============");
		
		System.out.println(name);
		
		scanner.close();
		
		}

}
