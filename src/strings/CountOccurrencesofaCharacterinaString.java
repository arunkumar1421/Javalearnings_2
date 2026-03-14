package strings;

public class CountOccurrencesofaCharacterinaString {

	public static void main(String[] args) {
		
		String s= "Selenium testing with Java programming";
		
		/*
		 * int total_len= s.length();
		 * 
		 * int remove_len= s.replaceAll("i", "").length();
		 * 
		 * int count_Of_char= total_len-remove_len;
		 * 
		 * System.out.println("Occurance of e: "+ count_Of_char);
		 */
		
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			System.out.println(s.charAt(i) +"-- occured "+count+" times in a "+s);
		}
	}

}
