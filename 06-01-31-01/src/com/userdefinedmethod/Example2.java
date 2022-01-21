package com.userdefinedmethod;

//user defined method

public class Example2 {
	
	public static void getmessage(String text)//text parameter
	{
	
	System.out.println("return type is void :");//calling method body
	
}
	
	public static String getmessage1(String text)//text parameter
	
	{
		
		return text;
	
	
	}
	
	public static void main(String[] args)//pre-defined method
	
	{
		getmessage("return type is void :");//calling user defined method
     System.out.println(getmessage1("narmadha"));//calling method  by passing arguments/values
		
	}
	
}
	