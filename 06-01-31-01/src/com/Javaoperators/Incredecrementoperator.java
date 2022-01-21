package com.Javaoperators;

public class Incredecrementoperator {

	public static void main(String[] args) {

		
		int num1 = 18, num2 = 45, num3 = 56, num4=97 , ex1, ex2,ex3,ex4;
		
		ex1 = num1++; //post increment
		System.out.println(ex1); //18
		
		System.out.println("-------------------------");
		
		ex2 = ++num2;//pre-increment
		System.out.println(ex2);//46
		
		System.out.println("----------------------------");
		
		ex3 = num3--;//post decrement
		System.out.println(ex3);//56
		
		System.out.println("----------------------------");
		
		ex4 = --num4; //pre-decement
		System.out.println(ex4);//96
		
	}

}
