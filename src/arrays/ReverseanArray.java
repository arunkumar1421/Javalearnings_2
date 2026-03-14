package arrays;

import java.util.Scanner;

public class ReverseanArray {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size");
		int n= sc.nextInt();
		
		int a[]= new int[n];
		System.out.println("enter array numbers");
		
		int i=0;
		
		while(i<n)
		{
			a[i]= sc.nextInt();
			i++;
		}
		int j=n-1;
		while(j>=0)
		{
			System.out.println(a[j]);
			j--;
		}
	}

}
