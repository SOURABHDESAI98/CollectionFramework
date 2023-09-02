package mapInterface.treeMap.labAssignments;

import java.util.SortedMap;
import java.util.TreeMap;

public class A12 {

	/*
	 * 3.WAP to search a key in a TreeMap.
	 * 
	 */

	public static void main(String[] args) {

		SortedMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		tmap.put(4, 104);
		tmap.put(1, 101);
		tmap.put(3, 103);
		tmap.put(2, 102);

		boolean isPresent = false;
		for (Integer key : tmap.keySet()) {

			if (key == 2) {
				isPresent = true;
			}
		}

		if (isPresent) {
			System.out.println("key is present");
		} else {
			System.out.println("key is not present");
		}

	}

}
