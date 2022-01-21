package com.switchstatement;

public class Exampe1 {

	public static void main(String[] args) {

        char grade = 'B'; // intialized varible
		
		switch (grade)   // using switch statement
		
		{ 	
		
		case 'A':
			System.out.println("Excellent!"); // A represent Excellent
			break;
		
		case 'B':
		   System.out.println("Outstanding!");// b represent outstanding
		   break;
		
		case 'C':
			System.out.println("Good");// C represent good 
		   break;
		
		case 'D':
			System.out.println("Just passed"); //D represent just passed
		   break;
		   
		default:
			   System.out.println("invalid grade");// default represent invalid grade
		}	   
	}
}
