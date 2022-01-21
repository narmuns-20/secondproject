package com.array;

public class Example4 {

	public static void main(String[] args) {

		/**
		 * array is derived data types in java is collection of similar and 
		 * stored multiple values in a single variable 
		 * 
		 */
		
		int rollNo[]  = {12,14,16,18,20,22,24,28};
		
		System.out.println(rollNo[2]);
		
		for (int i=0; i<rollNo.length; i++)
		{
			System.out.println(rollNo[i]);
			
			if(i==4)
			{
				break;
			}
			
		}
	}
}