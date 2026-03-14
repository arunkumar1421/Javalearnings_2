package strings;

import java.util.Scanner;

public class CountwordsinaString {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter string :");
		
		String s= sc.nextLine();
		int count=1;
		
		for (int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("No of words in a string: "+ count);
	}

}
