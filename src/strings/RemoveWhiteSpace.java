package strings;

import java.util.Scanner;

public class RemoveWhiteSpace {
	public static void main(String args[])
	{
		/*
		 * Scanner sc= new Scanner(System.in); System.out.println("Enter string : ");
		 * String s= sc.next();
		 */
		
		String s="A d r g r ";
		//method1
		System.out.println("String replcement :"+ s.replaceAll("\\s", ""));
		
		//method2
		String s1="";
		System.out.println("String before removing spaces: "+ s);	
		System.out.println("String legth: "+ s.length());
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				s1=s1+s.charAt(i);
			}
		}
		
		System.out.println("String after removing spaces: "+s1);
	}

}
