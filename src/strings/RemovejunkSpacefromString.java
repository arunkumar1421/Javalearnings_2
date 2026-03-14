package strings;

import java.util.Scanner;

public class RemovejunkSpacefromString {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String str= sc.next();
		
		// method 1
		
		System.out.println("After replacing all special characters: " + str.replaceAll("[^a-zA-Z0-9]","") );
		
		//method2
		String s="";
		System.out.println("String before removing spaces" + str);
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='a'&& str.charAt(i)<='z')||(str.charAt(i)>='A'&& str.charAt(i)<='Z'))
			{
				s=s+str.charAt(i);
			}
		}
		
		System.out.println("String after removing spaces: " + s);

	}

}
