package arrays;

import java.util.Scanner;

public class SearchElemnetinArrAY {
	static boolean status= false;
	static void searchelement(int key,int n,int a[])
	{
		for (int i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				status= true;
				System.out.print("elemnt found: "+ key + " at index of "+ i);
			}
		}
		if (status== false)
		{
			System.out.println("Element not found: "+ key);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("enter size of array: ");
		int n= sc. nextInt();
		int arr[]= new int [n];
		
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.print("enter search element: ");
		int search= sc.nextInt();
		
		searchelement(search,n,arr);

	}

}
