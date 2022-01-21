package com.binaryoperator;

public class Example6 {

	public static void main(String[] args) {

              //Bitwise operator

				int a = 30;
				int b = 15;

				System.out.println("&: "+(a & b));

				System.out.println("|: "+(a | b));	
				
				/**
				 * 		00001010
				 * &	00000101
				 * -----------------
				 * 		00000000 - 0
				 * 
				 * 		00001010
				 * |	00000101
				 * -----------------
				 * 		00001111 - 15
				 * 
				 */

			}

		}

