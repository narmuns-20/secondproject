package com.multidimentionalarray;

//Write a program for 2d two dimensional array

public class Example3 {

	public static void main(String[] args) {

		int lotterycard[][] = { {17,4,}, {26,35,}};
		
		lotterycard[0][0] = 17;
		lotterycard[0][1] = 4;
		lotterycard[1][0] = 26;
		lotterycard[1][1] = 35;
		
		//rows and columns
		
		System.out.println(lotterycard[0][0]);
		
		System.out.println("============================");
		
		for (int i=0; i<1; i++)//using for loop
			
		{
			for(int j=0; j<1; j++)
				
			{
				
				System.out.println(lotterycard[i][j]);
				
				
		}
		}		
		}
		}
