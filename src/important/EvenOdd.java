package important;

public class EvenOdd {
	
	public static void isEvenOdd(int n)
	{
		if(n==0)
		{
			System.out.println("whole number");
		}
		else if(n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
	}
	
	public static void main(String args[])
	{
		int n=0;
		isEvenOdd(n);
	}

}
