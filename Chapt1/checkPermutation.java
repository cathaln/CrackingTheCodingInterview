//Chapt1Q2
import java.util.HashMap;

class checkPermutation{

	public static void main(String[] args) {
		System.out.println(isStrPermutation("hello", "ohill"));
	}

	static boolean isStrPermutation(String word1, String word2){

		/*
		Check if both string are the same length, if they aren't then there is no permutations.
		Navigate through one string checking characters and incrementing said char key in hashmap. Decrementing in the second word. 
		Check hashmap values are all 0. If not, return false.

		Time complexity: O(N+M) where N is the length of the words passed, and M is the number of unique chars in the hashmap. 
		*/

		HashMap <Character, Integer> letterCount = new HashMap<Character, Integer>();
		if (word1.length() != word2.length()){
			return false;
		}

		for(int i=0; i<word1.length(); i++){

			char letterFromOne = word1.charAt(i);
			char letterFromTwo = word2.charAt(i);
			if (letterCount.containsKey(letterFromOne)){
				letterCount.put(letterFromOne, letterCount.get(letterFromOne) + 1);
			}
			else{
				letterCount.put(letterFromOne, 1);
			}

			if (letterCount.containsKey(letterFromTwo)){
				letterCount.put(letterFromTwo, letterCount.get(letterFromTwo) - 1);
			}
			else{
				letterCount.put(letterFromTwo, -1);
			}

		}
		for(Character key: letterCount.keySet()){
			if(letterCount.get(key) != 0){
				return false;
			}
		}
		return true;
	}
}