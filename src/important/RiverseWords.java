package important;

public class RiverseWords {

	public static String wordRiverse(String s)
	{
		StringBuilder str=new StringBuilder();
		String s1[]= s.split(" ");
		for(int i= s1.length-1;i>=0;i--)
		{
			str=str.append(s1[i]).append(" ");
		}
		return str.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "arun kumar is good boy";
		System.out.println(wordRiverse(s));

	}

}



