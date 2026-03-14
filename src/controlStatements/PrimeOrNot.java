package controlStatements;

import java.util.Scanner;

public class PrimeOrNot {
	int div=0;
	public void isPrime(int num)
	{
		for(int i=1;i<=num; i++)
		{
			if (num%i==0)
			{
				div=div+1;
			}
		}
		if (div==2)
		{
			System.out.println(num +" is a prime number");
		}
		else
		{
			System.out.println(num +" is not a prime number");
		}
	}
	
	public static void main (String args[])
	{
		PrimeOrNot p= new PrimeOrNot();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number:");
		int n= sc.nextInt();
		
		p.isPrime(n);
	}

}
