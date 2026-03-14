package controlStatements;

import java.util.Scanner;

public class SwitchStatement {
	
	public void Weekday(String Day_name)
	{
		switch(Day_name)
		{
			case "Sunday" : System.out.println(1);break;
			case "Monday" : System.out.println(2);break;
			case "Tuesday" : System.out.println(3);break;
			case "Wednesday" : System.out.println(4);break;
			case "Thursday" : System.out.println(5);break;
			case "Friday" : System.out.println(6);break;
			case "Saturday" : System.out.println(7);break;
			default : System.out.println("entered wrong day name");
			
		}
		
	}
	public static void main(String args[]) {
		SwitchStatement s= new SwitchStatement();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your day:");
		String day= sc.next();
		s.Weekday(day);
	}

	

}
