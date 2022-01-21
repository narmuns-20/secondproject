package com.typesofarray;

public class Example2 {

	//single dimensional array in multiple lines

	public static void main(String[] args) 
	
	{

		//declaration and instantiation(An array object creation)
		
		int newcommerIds[] = new int[6];
			
		//initialization
		newcommerIds[0] = 3900;
		newcommerIds[1] = 4000;
		newcommerIds[2] = 4010;
		newcommerIds[3] = 4020;
		newcommerIds[4] = 4004;
		newcommerIds[5] = 4002;

		for(int i = 0; i < newcommerIds.length; i++)
		{
			System.out.println(newcommerIds[i]);
				}


		}

	}
