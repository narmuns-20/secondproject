package com.multidimentionalarray;

//Write a program for 3D three dimensional array

public class Example4 
{

	public static void main(String[] args)
	
	{

	int lotteryCard[][] = {{2,4,6},{5,15,25},{20,30,40}};//3*3 rows and columns

	System.out.println(lotteryCard[0][0]);
	
	System.out.println("============================");
	
	for (int i=0; i<3; i++)//using for loop
		
	{
		for(int j=0; j<3; j++)
			
		{
			
			System.out.println(lotteryCard[i][j]);
			
			
	}
	}		
	}
	}
