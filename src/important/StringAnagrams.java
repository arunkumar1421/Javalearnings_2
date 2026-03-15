package important;

import java.util.Arrays;

public class StringAnagrams {

	/**
     * An anagram is when all the letters in one string exist in another
     * but the order of letters does not matter.
     */
    public static boolean isAnagram(String str, String str1) {
    	
    	if(str.length()!=str1.length())
    	{
    		return false;
    	}
        // convert both String to char[]
        char[] arrStr = str.toCharArray();
        char[] arrStr1 = str1.toCharArray();

        // sort both char[] arrays
        Arrays.sort(arrStr);
        Arrays.sort(arrStr1);

        // compare sorted arrays. If sorted arrays are equal, two strings are anagram
        return Arrays.equals(arrStr, arrStr1);
    }
    
	public static void main(String[] args) {
		String s= "madam";
		String s1= "damamm";
		
		System.out.println(isAnagram(s,s1));

	}

}
