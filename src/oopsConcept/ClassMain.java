package oopsConcept;

import java.util.Scanner;

public class ClassMain {
	
	public static void main(String args[])
	{
		SumOfNumbers s= new SumOfNumbers();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers: ");
		
		int a= sc.nextInt();
		int b=sc.nextInt();
		s.sum(a, b);
	}

}
