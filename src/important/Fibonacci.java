package important;

public class Fibonacci {
	
	public static void fibonacci(int n)
	{
		int a=0,b=1;
		int c=0;
		System.out.println(a+"\n"+b);
		for (int i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		fibonacci(n);

	}

}
