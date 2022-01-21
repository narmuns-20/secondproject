package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		
		 double l,b;
		 
		Scanner s= new Scanner(System.in);
	        
         System.out.println("Enter the length:");
         
          l= s.nextDouble();
      
         System.out.println("Enter the breadth:");
      
         b= s.nextDouble();
        
           double area =l*b;
     
         System.out.println("Area of Rectangle is: " + area);        
		
		   s.close();  
		   }

}
