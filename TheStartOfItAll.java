import java.util.concurrent.SynchronousQueue;

public class TheStartOfItAll {
	
	/*
	 * The first know secret code
	 * it is an alphabet shift
	 * start with plain text, and a "key"
	 * let's say key = 2, and
	 * plain text is abc
	 * then a + 2 --> c
	 * b + 2 --> d
	 * c + 2 --> e
	 * so secret code for abc is cde
	 * deciphering the code is just reversing the key
	 */
	
	/*
	 * GRADED REQUIREMENTS
	 * Part One - The First Grade
	 * 
	 * 0. use a JOP to ask for the normtext, then
	 * 1. Fix the space problem (hint: use an if to test for a space, if yes add a space to encryptedtext)
	 * 2. Fix the z wrap (hint: if index + key > 25, then subtract 25
	 * example z + 2 is 25 + 2 = 27; 27 > 25 so crash; instead if > 25 subtract 25
	 * so from above 27 - 25 = 2 = b perfect!
	 * 
	 * for this part, syso is just fine
	 * 
	 * NEXT Part 2
	 * add decoding knowing the key -- reverse the process
	 * 
	 * NEXT Part 3
	 * crack a code where you do not know the key!
	 * JOP'd and jar's
	 */

	public static void main(String[] args) {
		
		String alpha = "abcdefghiklmnopqrstuvwxyz";
		int key = 2;
		String normtext = "abc";
		String encryptedtext = "";
		int indexnormtext = 0;
		int indexshifted = 0;
		
		// one baby step at a time -- couple lines of code + test ...
		
		normtext = normtext.toLowerCase();
		
		//System.out.println("lowercase: " + normtext);
		
		//normtext.charAt(0) tells me the char at posn 0 [I]
		//fine the alphabetical index for that char at posn 0
		//so for the I it is a...b...c...d...e...f...g...h...i should be 8
		
		
		for(int i = 0; i < normtext.length(); i++){
		indexnormtext = alpha.indexOf(normtext.charAt(i));
		
		//System.out.println("alpha index for the first char of normtext is: " + indexnormtext);
		//+ indexnormtext);
		
		// now, shift using the key
		
		indexshifted = indexnormtext + key;
		
		//System.out.println("key: " + key);
		//System.out.println("index of normtext: " + indexnormtext);
		//System.out.println("index of encryptedtext: " + indexshifted);
		//System.out.println("shifted char is: " + alpha.charAt(indexshifted));
		
		encryptedtext = encryptedtext + alpha.charAt(indexshifted);
		
		}// end of for loop
		
		System.out.println("Original: " + normtext);
		System.out.println("key: " + key);
		System.out.println("Secret Code Msg: " + encryptedtext);

	}// end of main
	
}// end of class	
	
	
	