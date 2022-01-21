package com.conditionalstatement;

//Write a program for nested if-else statement

public class Example4 {

	public static void main(String[] args) {
			
		int num1 = 36;//Variable intialized 
        
		if(num1 >= 14)//using nested  if statement
          {
        if(num1<146)
           {
          System.out.println("num1 is a double digit number");
               }
        
             else //using nested else statement
                 
               {
                 System.out.println("num1 is not a double digit number");
               }
           }
         else
          {
            System.out.println("num1 is less than 10");
          }  
         System.out.println("code after nested if else block");                   
      }
}
		 
