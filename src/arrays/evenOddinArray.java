package arrays;

import java.util.Scanner;

public class evenOddinArray {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n= sc.nextInt();
		int a[]= new int [n];
		int even=0, odd=0;
		
		System.out.println("Enter array elements:");
		
		for (int i=0; i<n;i++)
		{
			a[i]= sc.nextInt();
		}
		
		for (int i=0; i<n;i++)
		{
			if(a[i]%2==0)
			{
				even++;
			}
			else
				odd++;
		}
		System.out.println("No of even numbers "+even +"\nno of odd numbers:"+odd);
		
	
	}

}
