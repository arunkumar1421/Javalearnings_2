package important;

import java.util.Scanner;

public class PrimeNumber {
	
	public void isPrimeNumber(int n)
	{
		int div=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				div++;
			}
		}
		
		if(div==2)
		{
			System.out.println("It is a Prime Number");
		}
		
		else 
		{
			System.out.println("It is not a Prime Number");
		}
	}
	
	 public static boolean isPrime(int num) {
	        // create numbers from 2 till half inclusive of the num
	        for (int i = 2; i <= num / 2; i++) {
	            // try each number by using %
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number:");
		int n= sc.nextInt();
		
		PrimeNumber p= new PrimeNumber();
		p.isPrimeNumber(n);
		System.out.println(isPrime(n));
	}

}
