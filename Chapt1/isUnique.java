// Q1.1
import java.util.HashMap;

class isUnique{

	public static void main(String[] args) {
		checkUniqueStr("helo");
	}

	static boolean checkUniqueStr(String str){

		/*
		Navigate through chars of string, checking if they are already in Hashmap.
		If so, char is not unique.
		Time Complexity: O(N) where N is the number of characters in the string. 
		*/

		HashMap<Character, Integer> unique_char = new HashMap<Character, Integer>();

		for(int i=0; i < str.length(); i++){

			char letter = str.charAt(i);
			if(unique_char.containsKey(letter)){
				System.out.println("The letter '" + letter + "' is not unique.");
				return false;
			}
			else {
				unique_char.put(letter, 0);
			}
		}
		System.out.println("All letters are unique.");
		return true;

	}

}