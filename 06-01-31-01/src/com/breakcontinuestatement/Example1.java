package com.breakcontinuestatement;

public class Example1 {

	public static void main(String[] args) {

		int n=8;
		
		 // for loop
        for (int i = 1; i <= n; ++i) 
        
        {

            // if the value of i is 4 the loop terminates  
          
        	if (i==4) {
                break;
            }      
            
        	System.out.println(i);
        }   
    }
}