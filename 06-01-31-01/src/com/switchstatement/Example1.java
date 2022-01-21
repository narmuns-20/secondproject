package com.switchstatement;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the input value:");
		
		  String str = scan.next();
		  
		  switch (str)

		  {
	
		  
		  case "0":
		  case "1":
		  case "2":
		  case "4":
		  case "5":
		  case "6":
		  case "7":
		  case "8":
		  case "9":
			  
			  System.out.println("your character value is Digit:");
			  
			  break;
			  
		  case "A":
		  case "B":
		  case "C":
		  case "D":
		  case "E":
		  case "F":
		  case "G":
		  case "H":
		  case "I":
			  
			  System.out.println("the given character is AlPHABETIC:");
	      
			  break;
			  
			  default:
			  
			  System.out.println("the given character is SPECIAL CHARACTER:");
			  
		  }
		  
	}
}


			
	
