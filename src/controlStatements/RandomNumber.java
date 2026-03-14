package controlStatements;

import java.util.Random;

public class RandomNumber {
	
	public static void main(String args[])
	{
		Random rnum= new Random();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Generated Random Number: "+ rnum.nextInt(100));
		}
	}
}
