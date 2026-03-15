package important;

import java.util.Scanner;

/*FizzBuzz. Print numbers from 1 to 100
- If a number is divisible by 3 print Fizz
- If a number is divisible by 5 print Buzz
- If a number is divisible by both 3 and 5 print FizzBuzz*/

public class FizzBuzz {
	
	static void fizzbuzz(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		fizzbuzz(n);

	}

}
