package controlStatements;

public class IsEvenOddNumber {
	
	public static void isEvenOdd(int n)
	{
		if (n%2==0)
		{
			System.out.println(n+" is even number");
		}
		else
		{
			System.out.println(n+ " is odd number");
		}
	}
	
	public static void main (String args[])
	{
		isEvenOdd(3);
	}

}
