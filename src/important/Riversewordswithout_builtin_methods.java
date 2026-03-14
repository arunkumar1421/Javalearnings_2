package important;

public class Riversewordswithout_builtin_methods {

	    public static String wordReverse(String s) {
	        String result = "";
	        String currentWord = "";

	        // Iterate from the end of the string to the beginning
	        for (int i = s.length() - 1; i >= 0; i--) {
	            char c = s.charAt(i);

	            // If character is not a space, add it to the FRONT of our current word
	            if (c != ' ') {
	                currentWord = c + currentWord;
	            } 
	            // If we hit a space, it means a word has ended
	            else {
	                if (currentWord != "") {
	                    result = result + currentWord + " ";
	                    currentWord = ""; // Reset for the next word
	                }
	            }
	        }
	        
	        // Add the very last word remaining in the buffer
	        result = result + currentWord;

	        return result;
	    }

	    public static void main(String[] args) {
	        String s = "arun kumar is good boy";
	        String reversed = wordReverse(s);
	        System.out.println(reversed);
	    }
	}
