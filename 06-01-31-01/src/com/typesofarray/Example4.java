package com.typesofarray;

//MultiDimensional Array in multiple line


public class Example4 {

	public static void main(String[] args) {

		//declaration and instantiation(An array object creation)
		int customerIds[][] = new int[3][3];
		
		//initialization
		customerIds[0][0] = 1000;
		customerIds[0][1] = 1010;
		customerIds[0][2] = 1020;
		
		customerIds[1][0] = 2020;
		customerIds[1][1] = 2040;
		customerIds[1][2] = 2080;
		
		customerIds[2][0] = 3020;
		customerIds[2][1] = 3040;
		customerIds[2][2] = 3060;

		for(int i = 0; i < customerIds.length; i++)
		{
			for(int j = 0; j < customerIds.length; j++)
			{
				System.out.println(customerIds[i][j]);
			}
		}
		
		System.out.println("===================");
		
		for(int i = 0; i < customerIds.length; i++)
		{
			for(int j = 0; j < customerIds.length; j++)
			{
				System.out.print(customerIds[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
}
