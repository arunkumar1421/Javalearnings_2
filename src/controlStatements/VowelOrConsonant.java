package controlStatements;

import java.util.Scanner;

public class VowelOrConsonant {
	
		public static void isVowelOrConsonant(char c)
		{
			if ((c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'|| c=='E' || c=='I'|| c=='O'||c=='U'))
			{
				System.out.println(c+" is the Vowel ");
			}
			
			else
			{
				System.out.println(c+" is not the Consonant ");
			}
		}
		
		public static void main(String args[])
		{
			//isCharacter('$');
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter charatcter");
			char ch= sc.next().charAt(0);
			isVowelOrConsonant(ch);
			
		}

	}
