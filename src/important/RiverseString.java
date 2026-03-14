package important;

public class RiverseString {
	
	 static String str1="";
	static void stringRiverse(String str)
	{
		for (int i=str.length()-1; i>=0;i--)
		{
			str1 = str1 +str.charAt(i);
		
		}
		
		System.out.println("riverse of a given string: " + str1);
	}
	
	public static void main(String args[])
	{
		String s1= "Arun";
		
		stringRiverse(s1);
	}

}
