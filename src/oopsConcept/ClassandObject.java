package oopsConcept;

import java.util.Scanner;

public class ClassandObject {
	
	/*
	 * public void sumOfNumbers(int a, int b) {
	 * System.out.println("Sum of two numbers: "+ (a+b)); }
	 */
	int a ;
	int b ;
	public static void sumOfNumbers(int a, int b)
	{
		System.out.println("Sum of two numbers: "+ (a+b));
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers: ");
		/*
		 * int a= sc.nextInt(); int b= sc.nextInt();
		 */
		
		ClassandObject cb= new ClassandObject();
		//cb.sumOfNumbers(a,b);
		//sumOfNumbers(a,b);
		
		cb.a=2;
		cb.b=4;
		cb.sumOfNumbers(cb.a,cb.b);
		
		/*
		 * ClassandObject cb1= new ClassandObject(); ClassandObject cb2= new
		 * ClassandObject(); cb1.sumOfNumbers(a,b); cb2.sumOfNumbers(a,b);
		 */

	}
	
	
	

}
