package controlStatements;

public class FactorialOfaNumber {
	
	public static void main(String args[])
	{
		int n=5;
		int fact=1,i=1;
		
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		
		System.out.println("Factorial of "+n+": "+ fact);
	}

}
