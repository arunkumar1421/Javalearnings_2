package strings;

import java.util.Scanner;

public class Main{
static void stringLen(String s)
	{
		System.out.println("length of a string is "+s+" " + s.length());
	}
	
	static void stringconcat(String s1, String s2)
	{
		System.out.println("String after concatenation :" + s1.concat(s2));
	}
	
	void stringcontains(String s, String c)
	{
		if (s.contains(c))
		System.out.println(s+" contains "+ c);
		else 
			System.out.println(s+" not contains "+ c);
	}
	
	public void stringequals(String s1, String s2)
	{
		if(s1.equals(s2))
		{
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
	}
	public void stringequalsIgnorecase(String s1, String s2)
	{
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
	}
	
	public static void StringTrim(String s)
	{
		System.out.println("String befor trim "+s.length());
		System.out.println("String after trim "+ s.trim());
		System.out.println("String after trim "+s.length());
	}
	
	public static void stringSplit(String s,String c)
	{
		System.out.println("String after splitting "+s.split(c));
	}
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
		System.out.println("Enter strings to test: ");
		String str= sc.next();
		String str2= sc.next();
		
		//Calling static methods
		stringLen(str);
		stringconcat(str,str2);
		stringSplit(str,"l");
		
		//creating object for the class to call non static methods
		Main b= new Main();
		
		b.stringcontains(str, str2);
		b.stringequals(str, str2);
		StringTrim("   Arun   ");
		b.stringequalsIgnorecase(str, str2);
}
}
