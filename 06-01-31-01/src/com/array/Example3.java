package com.array;

public class Example3 {

	public static void main(String[] args) {

		/**
		 * array is derived data types in java is collecction of similar and 
		 * stored multiple values in a single variable 
		 * 
		 */
		
		int leanersId[]  = {12,14,16,18,20,22,24,28};
		
		System.out.println(leanersId[7]);
		
		for (int i=0; i<leanersId.length; i++)
		{
			System.out.println(leanersId[i]);
			
			if(i==5)
			{
				break;
			}
			
		}
	}
}