package com.method;

		//main method

		public class Example4
		{


				/**
				 * Write a java program for calculator(sum,sub,product,division,mode) 
				 * using method
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

			    	  division1();
			    	  mode1();
		}
}