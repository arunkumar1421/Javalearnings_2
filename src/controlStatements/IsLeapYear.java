package controlStatements;

import java.util.Scanner;

public class IsLeapYear {
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter year to find");
		
		int year= sc.nextInt();
		
		if (year%4==0) {
		
			if (year%100==0) {
				
			if (year%400==0)

				System.out.println(year+ " is a leap year");
			else 
				System.out.println(year+" is not aleap year");
	     }
			else {
				System.out.println(year+" is aleap year");
			}
		}
		else
		{
			System.out.println(year +" is not a leap year");
		}
		
}
}
