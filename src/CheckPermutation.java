import java.util.HashMap;

/*
 * Given two strings, write a method to decide if one is a permutation of the other.
 */

/*
 * Thought process:
 * We can iterate fully through the first string and store each character in a hash map, then we
 * can loop through the other and check if each character is in the other string as well.
 */
public class CheckPermutation {
	public boolean isPermutationOf(String str1, String str2) {
		
		HashMap<Character, Character> string1Map = new HashMap<>();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		// store each char in str1 in our map
		for(int i = 0; i < str1.length(); i++) {
			string1Map.put(str1.charAt(i), str1.charAt(i));
		}
		
		// check if each char in str2 is also in the map
		for(int i = 0; i < str2.length(); i++) {
			if(string1Map.containsValue(str2.charAt(i))) {
				string1Map.remove(str2.charAt(i));
			}
			else {
				return false;
			}
		}
		
		// if we haven't cleared the map we know there are extra letters, so return false
		if(string1Map.size() != 0) {
			return false;
		}
		
		return true;
	}
}
