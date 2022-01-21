package com.breakcontinuestatement;

public class Example2 {

	public static void main(String[] args) {

		int n=6;
		
        for (int i = 1; i <= n; ++i)  // for loop
        {
         	if (i==4) // if the value of i is 4 the loop terminates
        	{
             continue;
            }      
            
        	System.out.println(i);
        }   
    }
}