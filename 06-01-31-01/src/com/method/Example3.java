package com.method;
  
//main method

public class Example3 {

	public static void main(String[] args) {

		/**
		 * Write a java program for calculator(sum,syb,product,division,mode) 
		 */
		
	    //step 1 Variables declared and intialized
		
		int num1 = 20 , num2 = 30 ,sum,sub,product,division,mode;
		
		//sum
	      sum = num1+num2;
	      System.out.println(sum);
				
	    //sub
	      sub = num1-num2;
	      System.out.println(sub);
	      
	      
	     //product
			product = num1*num2;
			System.out.println(product);
			
	      
	    //division
	      division = num1/num2;
	      System.out.println(division);
				
		
		//mode
		mode = num1%num2;
		System.out.println(mode);
		
	}

}
