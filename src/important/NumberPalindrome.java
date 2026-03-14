package important;

public class NumberPalindrome {
	static void isPalindrome(int n)
	{
		int sum=0;
		int rem;
		int copy=n;
		
		while(n>0)
		{
			 rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(sum==copy)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palnidrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 101;
		isPalindrome(n);
		

	}

}
