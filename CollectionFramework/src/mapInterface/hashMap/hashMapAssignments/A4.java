package mapInterface.hashMap.hashMapAssignments;

import java.util.HashMap;

/*
 * WAP to create a map using Wrapper class as key and value same as keys’ data type WAP to 
count the number of key-value (size) mappings in a map.
 */

public class A4 {

	public static void main(String[] args) {

		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		hmap.put(1, 1);
		hmap.put(2, 2);
		hmap.put(3, 3);
		hmap.put(4, 4);
		hmap.put(5, 5);

		System.out.println(hmap.size());

	}

}
