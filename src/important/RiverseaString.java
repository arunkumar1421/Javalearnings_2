package important;

import java.util.Scanner;

public class RiverseaString {

	public static String riverseStr(String str)
	{
		String s1="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			s1= s1+str.charAt(i);
		}
		return s1;
		
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println(riverseStr((sc.next())));

	}

}
