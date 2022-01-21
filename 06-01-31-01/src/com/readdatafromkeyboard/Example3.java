package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		
		
		String name;
		
	    int a;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("enter name:");
	    
	    name = scanner.nextLine();
	    
	    System.out.println("a");
	    
	   a = scanner.nextInt();
	  
	    System.out.println("===============");
	    
	    System.out.println("Name:" + name);
	    
	    System.out.println("age:"  + a );
	    
	    scanner.close();
	    
	    
	}

}
