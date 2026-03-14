package controlStatements;

import java.util.Scanner;

public class LargestOF2Numbers {
	
	public static void main(String args[])
	{
	    Scanner sc= new Scanner(System.in);
	    
	    System.out.println("enter numbers:");
	    int a= sc.nextInt();
	    int b= sc.nextInt();
	    
	    if (a>b)
	    {
	    	System.out.print("a is greater "+a );
	    }
	    else
	    	System.out.println("b is greater "+b);
	    
	    System.out.println("Greatest number:" + ((a>b)?a:b));
	    
	}

}
