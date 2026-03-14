package controlStatements;

public class FibonacciSeries {
	
	public static void fibonacci(int n)
	{
		int a=0,b=1;int i=1;
		while (i<=n)
		{
			System.out.println(a);
			int c= a+b;
			a=b;
			b=c;
			i++;
		}
	}
	
	public static void main(String args[])
	{
		int num=10;
		fibonacci(num);
	}

}
