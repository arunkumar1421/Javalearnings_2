package arrays;

import java.util.Arrays;

public class Single_dimensional {
	
	public static void main(String args[])
	{
		int a[] = new int[4];
		
		a[0]= 1;
		a[1]= 2;
		a[2]= 3;
		a[3]= 4;
		
		System.out.println(a[2]);
		
		System.out.println("Array elemnts: " + Arrays.toString(a));
		
		
		System.out.println("Printing array elements using for loop:");
		
		for (int i=0; i<4;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
