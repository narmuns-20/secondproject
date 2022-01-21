package com.javaidentifiers;

public class studentrollno 
{

	public static void main(String[] args)
	{
		
	}
		
		   public int roll_no; 
		    public String name; 
		    studentrollno(int roll_no, String name) 
		    { 
		        this.roll_no = roll_no; 
		        this.name = name; 
		        
		        System.out.println(roll_no);
		        System.out.println(name);
		    
	
	  
		// Elements of array are objects of a class Student. 
		        // declares an Array of integers. 
		        studentrollno[] arr; 
		        		  
		        // allocating memory for 5 objects of type Student. 
		        arr = new studentrollno[5]; 
		  
		        // initialize the first elements of the array 
		        arr[0] = new studentrollno(1,"aman"); 
		  
		        // initialize the second elements of the array 
		        arr[1] = new studentrollno(2,"vaibhav"); 
		  
		        // so on... 
		        arr[2] = new studentrollno(3,"shikar"); 
		        arr[3] = new studentrollno(4,"dharmesh"); 
		        arr[4] = new studentrollno(5,"mohit"); 
		  
		        // accessing the elements of the specified array 
		        for (int i = 0; i < arr.length; i++) 
   System.out.println("Element at " + i + " : " +   arr[i].roll_no +" "+ arr[i].name); 
		    } 
}
