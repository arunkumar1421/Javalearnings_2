package important;

import java.util.Arrays;
import java.util.Scanner;

public class SunofTwoequaltoNumber {
	
	 static int [] sumOf2(int a[],int n)
	{
		 int sumof2[]= new int[2];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;i<a.length;i++)
			 {
				 if(a[i]+a[j]==n)
				 {
					 sumof2[0]=a[i];
					 sumof2[1]=a[j];
				 }
			 }
		 }
		return sumof2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a[]= new int[5];
		System.out.println("enter elements;");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int n=6;
		
		System.out.println(Arrays.toString(sumOf2(a,n)));
		

	}

}
