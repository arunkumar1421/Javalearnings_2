package important;

import java.util.Scanner;

public class ArrayRiverse {

	public static void riverseArray(int a[]) {
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n= sc.nextInt(); 
		int a[]= new int[n];
		
		System.out.println("enter aaray values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		riverseArray(a);
		

	}

}
