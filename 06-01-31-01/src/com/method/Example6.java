package com.method;

import java.util.Scanner;

public class Example6 {

		/**
		 * Write a java program for calculator(sum,sub,product,division,mode) 
		 * using method , Scanner class , Switch-case and while loop.
		 */
		
	    //step 1 Variables declared and initialized
		
	    static int num1 = 20 , num2 = 30 ,sum,sub,product,division,mode;
	    
	    static Scanner scanner = new Scanner(System.in);
		
		//sum
	    public static void sum1()
	    {
	    	
	    	System.out.println("Enter first value: ");
	    	num1 = scanner.nextInt();
	    	
	    	System.out.println("Enter second value: ");
	    	num2 =scanner.nextInt();
	    	
	         sum = num1+num2;
	         System.out.println("Sum :" +sum);
	      
	    }
				
	    //sub
	      public static void sub1()
	      {
	    	  System.out.println("Enter first value: ");
		    	num1 = scanner.nextInt();
		    	
		    	System.out.println("Enter second value: ");
		    	num2 =scanner.nextInt();
	    	  
	      sub = num1-num2;
	      System.out.println("sub :" +sub);
	      }
	      
	      
	     //product
	      public static void product1()
	      {
	    	  
	    	  System.out.println("Enter first value: ");
		    	num1 = scanner.nextInt();
		    	
		    	System.out.println("Enter second value: ");
		    	num2 =scanner.nextInt();
	    	  
	    	  
			product = num1*num2;
			System.out.println("product:" +product);	
	      }
			
	    //division
			public static void division1()
			{
				System.out.println("Enter first value: ");
		    	num1 = scanner.nextInt();
		    	
		    	System.out.println("Enter second value: ");
		    	num2 =scanner.nextInt();
				
				
	      division = num1/num2;
	      System.out.println("division:" +division);
			}
			
		//mode
	      public static void mode1()
	      {
	    	  System.out.println("Enter first value: ");
		    	num1 = scanner.nextInt();
		    	
		    	System.out.println("Enter second value: ");
		    	num2 =scanner.nextInt();
	    	  
		mode = num1%num2;
		System.out.println("mode:" +mode);
		
	}
	      
	      public static void main(String[] args) {

	    	  while(true)
	    	  {
	    	  
	    	  System.out.println("Calculator menu :\n");
	    	  System.out.println("1.Sum:");
	    	  System.out.println("2.Sub:");
	    	  System.out.println("3.product:");
	    	  System.out.println("4.division:");
	    	  System.out.println("5.mode:");
	    	  System.out.println("6.stop\n:");
	    	  
	    	  
	    	  System.out.println("Select your operation :");
	    	  
	    	  int operator = scanner.nextInt();
	    	  
	    	  switch(operator) 
	    	  {
	    	  
	    	  case 1:
	    		  sum1();
	    		  System.out.println("--------------------");
	    		  break;
	    		  
	    	  case 2:
	    		  sub1();
	    		  System.out.println("--------------------");
	    		  break;
	    		  
	    	  case 3:
	    		  product1();
	    		  System.out.println("--------------------");
	    		  break;
	    		  
	    	  case 4:
	    		  division1();
	    		  System.out.println("--------------------");
	    		  break;
	    		  
	    	  case 5:
	    		  mode1();
	    		  System.out.println("--------------------");
	    		  break;
	    		  
	    	  case 6:
	    		  System.exit(0);
	    		 System.out.println("--------------------------");
	    		  break;
	    		  
	    	  default:
	    			  
	    		  System.out.println("select valid operator......!: ");
	    		  System.out.println("-------------------------------");
	    		  
	    		  
	    	  }
	    	  
	    	  }
	    	  
	      }
  		  
}	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    		  
	    	  
	    	  
	    	  
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
