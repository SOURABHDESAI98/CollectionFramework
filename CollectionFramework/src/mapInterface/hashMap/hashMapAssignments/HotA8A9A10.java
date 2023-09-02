package mapInterface.hashMap.hashMapAssignments;

import java.util.HashMap;
import java.util.Map;

/*
 * 
 * WAP to copy all of the mappings from the specified HashMap to another map
 * 
 * WAP to test a HashMap is empty or not
 * 
 * WAP to test if a HashMap contains a mapping for the specified key.
 * 
 */

public class HotA8A9A10 {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Sourabh");
		hmap.put(2, "Sobodh");
		hmap.put(3, "Suraj");
		hmap.put(4, "Sunak");
		hmap.put(5, "sunil");

		HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();

		for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
			hmap2.put(entry.getKey(), entry.getValue());
		}

		System.out.println(hmap2);

		// Assignment 9
		System.out.println(hmap2.isEmpty());

		// Assignment 10
		System.out.println(hmap2.containsKey(4));
	}

}
