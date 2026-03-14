package arrays;

import java.util.Scanner;

public class Repeatednumbers {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of an arry: ");
		int n= sc.nextInt();
		int a[]= new int [n];
		
		
		System.out.println("Enter array elements:");
		for (int i=0; i<n; i++)
		{
			a[i]= sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
			System.out.println(a[i]+ "repeats "+count+" times");
		}
		
		
	}

}
