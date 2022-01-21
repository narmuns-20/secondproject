package com.uneryoperator;

public class Example1 {

	public static void main(String[] args) {


				int a = 20;
				int b = 30;

				/*
				 * The final local variable a cannot be assigned. 
				 * It must be blank and not using a compound assignment
				 */
				int task1 = a++;
				int task2 = ++b;
				
				System.out.println(task1);
				System.out.println(task2);		

			}

		}


