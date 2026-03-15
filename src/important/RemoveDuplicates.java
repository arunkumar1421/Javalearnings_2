package important;

public class RemoveDuplicates {
	
	public static String removeduplicates(String s)
	{
		String res="";
		
		for(int i=0;i<s.length();i++)
		{
			if(res.indexOf(s.charAt(i))==-1)
			{
				res=res+s.charAt(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "madam kjggkjjhkjgkhiiugygjniugfyrdfcgfcrcycnlkhjf";
		String s1=removeduplicates(s);

		System.out.print(s1);
	}

}
