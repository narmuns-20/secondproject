package com.userdefinedmethod;

public class Example3 {

   //user defined method definition
	
	public static String getMessage1(String text)  //text parameter
		{
			
			return text;
		}
		
		public static void main(String[] args)//predefined method
		{
			
			String text = getMessage1("String return type :");
			
			System.out.println(text);
			
		}
}
