package com.readdatafromkeyboard;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		double r;
		
	 Scanner s= new Scanner(System.in);
	        
         System.out.println("Enter the radius:");
       
          r= s.nextDouble();
       
           double  area=(22*r*r)/7 ;
         
      System.out.println("Area of Circle is: " + area);  
      
      s.close();
	}
	

}
