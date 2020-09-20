package DataStructureNotes;

import java.util.HashMap;

/*
 * Hash Map Big O
 * Search: O(n)
 */
public class HashMapExample {

	public static void main(String[] args) {
		// (key, value) pair
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, 23);
		map.put(1, 24);
		map.put(2, 89);
		map.put(3, -34);
		map.remove(3);
		
		
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.containsValue(24));
		System.out.println(map.containsKey(3));

	}

}
