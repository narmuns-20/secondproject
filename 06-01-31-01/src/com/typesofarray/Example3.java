package com.typesofarray;

//MultiDimensional Array in one line

public class Example3 {

	public static void main(String[] args) 
	
	{
			//declaration, instantiation and initialization of an array in one line
			
			int zizaid[][] = {{1012,1014}, {1025, 1035}};//2x2 = 4

			for(int i = 0; i < zizaid.length; i++)
			{
				for(int j = 0; j < zizaid.length; j++)
				{
					System.out.println(zizaid[i][j]);
				}
			}
			
			System.out.println("===================");
			
			for(int i = 0; i < zizaid.length; i++)
			{
				for(int j = 0; j < zizaid.length; j++)
				{
					System.out.print(zizaid[i][j]+"\t");
				}
				System.out.println("\n");
			}



		}

	}
