package important;

public class StringPalindrome {
	
	static void isPalindrome(String s)
	{
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		
		if(s.equals(s1))
		{
			System.out.println("It is a palnindrome");
		}
		
		else
		{
			System.out.println("It is not a palnindrome");
		}
	}

	public static void main(String[] args) {
		String s= "madam";
		isPalindrome(s);

	}

}
