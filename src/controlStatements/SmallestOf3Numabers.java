package controlStatements;

import java.util.Scanner;

public class SmallestOf3Numabers {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter numbers:");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		
		
		if(a<b)
		{
			if(c<a)
			{
				System.out.println("c is the smallest number:"+c);
			}
			else
				System.out.println("a is the smallest number:" + a);
		}
		else if (b<c)
		{
			System.out.println("b is the smallest number:" + b);
		}
		else 
			System.out.println("c is the smallest number :" + c);
	}

}
