package strings;

import java.util.Scanner;

public class StringPlaindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string: ");
		String str= sc.next();
		
		String str1= "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);
		}
		
		if(str.equals(str1))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");

	}

}
