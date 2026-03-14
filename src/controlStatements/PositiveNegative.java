package controlStatements;

import java.util.Scanner;

public class PositiveNegative {
	
	public void isPositive(int n)
	{
		if(n==0)
			System.out.print("it is a whole number");
		else if(n<0)
		
			System.out.println(n+" is negative number");
		
		else
			System.out.println(n+" is Positive Number");
	}
	
	public static void main (String args[])
	{
		PositiveNegative pn= new PositiveNegative();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number");
		int num= sc.nextInt();
		pn.isPositive(num);
	}

}
