package important;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountLetters {
 
	// printing letters and counts 
	public void countletters(String s)
	{
		Map<Character,Integer> letters= new LinkedHashMap<>();
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
			
			System.out.println("Letter "+s.charAt(i)+" occurs: "+ count+ " times in a string");
		}
	}

	
	//adding letters and their counts in to Hashmap and returning
	public Map<Character,Integer> mapcountletters(String s)
	{
		Map<Character,Integer> letters= new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(letters.containsKey(s.charAt(i)))
			{
				letters.put(s.charAt(i), letters.get(s.charAt(i)) + 1);
				
			}
			else {
                letters.put(s.charAt(i), 1);
			
	        	}
		}
		return letters;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "An anagram is when all the letters";
		CountLetters c= new CountLetters();
		//c.countletters(s.toLowerCase());
		
		System.out.println((c.mapcountletters(s.toLowerCase())));

	}

}
