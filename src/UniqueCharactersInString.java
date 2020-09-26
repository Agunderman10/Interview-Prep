import java.util.HashMap;

/*
 * Implement an algorithm to determine if a string has all unique characters
 */

/*
 * Thought process: 
 * We can loop through the entire string and store each character we see in a Hash Table which we
 * can then access with O(1) time. Overall, this should be linear time O(n)
 * 
 * loop through the string
 * at each character we see if we already have it in our hash table,
 * if we don't then we store it in the hash table,
 * if we do then we return false because we've found two identical characters
 */
public class UniqueCharactersInString {
	public boolean hasAllUniqueCharacters(String string) {
		
		HashMap<Integer, Character> stringMap = new HashMap<>();
		for (int i = 0; i < string.length(); i++) {
			char currentChar = string.charAt(i);
			
			// if the character is already in the hash table, return false.
			// otherwise, continue looping
			if(stringMap.containsValue(currentChar)) {
				return false;
			}
			else {
				stringMap.put(i, currentChar);
			}
		}
		return true;
	}
}
