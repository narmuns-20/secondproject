package com.binaryoperator;

public class Example2 {

	public static void main(String[] args) {

			//Assignment Arithmetic Operators

				int a = 200;//200
				int b = 20;

				System.out.println("+=: "+(a += b));//220
				
				/**
				 *  a += b 
				 *  => a = a+b
				 *  => a = 200+20
				 *  => a = 220  
				 */
				
				System.out.println("-=: "+(a -= b));//200
				/**
				 *  a -= b 
				 *  => a = a-b
				 *  => a = 220-20
				 *  => a = 20
				 */		
				System.out.println("*=: "+(a *= b));//2000
				/**
				 *  a *= b 
				 *  => a = a*b
				 *  => a = 200*20
				 *  => a = 2000 
				 */	
				
				System.out.println("/=: "+(a /= b));//100
				/**
				 *  a /= b 
				 *  => a = a/b
				 *  => a = 2000/20
				 *  => a = 100
				 */	
				System.out.println("%=: "+(a %= b));//0
				/**
				 *  a %= b 
				 *  => a = a%b
				 *  => a = 200%20
				 *  => a = 0  
				 */	
				
				/*
				 * +: 220 
				 * -: 200
				 * *: 2000
				 * /: 100 
				 * %: 0
				 * 
				 */

				
			}

		}

