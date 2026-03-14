package controlStatements;

import java.util.Scanner;

public class Character {
	public static void isCharacter(char c)
	{
		if ((c>='a' && c<='z')||(c>='A' && c<='Z'))
		{
			System.out.println(c+" is the Alphabet Character");
		}
		
		else
		{
			System.out.println(c+" is not the Aplhabet character");
		}
	}
	
	public static void main(String args[])
	{
		//isCharacter('$');
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter charatcter");
		char ch= sc.next().charAt(0);
		isCharacter(ch);
		
	}

}
