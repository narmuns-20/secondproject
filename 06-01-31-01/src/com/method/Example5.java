package com.method;

import java.util.Scanner;

public class Example5 {

					/**
					 * Write a java program for calculator(sum,sub,product,division,mode) 
					 * using method , Scanner class and Switch-case.
					 */
					
				    //step 1 Variables declared and initialized
					
				    static int num1 = 20 , num2 = 30 ,sum,sub,product,division,mode;
				    
				    
					
					//sum
				    public static void sum1()
				    {
				      sum = num1+num2;
				      System.out.println("Sum :" +sum);
				      
				    }
							
				    //sub
				      public static void sub1()
				      {
				      sub = num1-num2;
				      System.out.println("sub :" +sub);
				      }
				      
				      
				     //product
				      public static void product1()
				      {
						product = num1*num2;
						System.out.println("product:" +product);	
				      }
						
				    //division
						public static void division1()
						{
				      division = num1/num2;
				      System.out.println("division:" +division);
						}
						
					//mode
				      public static void mode1()
				      {
					mode = num1%num2;
					System.out.println("mode:" +mode);
					
				}
				      
				      public static void main(String[] args) {
	
				    	  Scanner scanner = new Scanner(System.in);
				    	  
				    	  System.out.println("Calculator menu :/n");
				    	  System.out.println("1.Sum:");
				    	  System.out.println("2.Sub:");
				    	  System.out.println("3.product:");
				    	  System.out.println("4.division:");
				    	  System.out.println("5.mode\n:");
				    	  
				    	  
				    	  System.out.println("Select your operation :");
				    	  
				    	  int operator = scanner.nextInt();
				    	  
				    	  switch(operator) 
				    	  {
				    	  
				    	  case 1:
				    		  sum1();
				    		  break;
				    		  
				    	  case 2:
				    		  sub1();
				    		  break;
				    		  
				    	  case 3:
				    		  product1();
				    		  break;
				    		  
				    	  case 4:
				    		  division1();
				    		  break;
				    		  
				    	  case 5:
				    		  mode1();
				    		  break;
				    		  
				    		  default:
				    		  
				    		  System.out.println("select valid operator......!: ");
				    		  
				    		  scanner.close();
				    		  
				    	  }
				      }
}
				    		  
				    		  
				    		  
				    		  
				    		  
				    		  
				    		  
				    		  
				    		  
				    		  
				    		  
				    		  
				    	  
				    	  
				    	  
				 