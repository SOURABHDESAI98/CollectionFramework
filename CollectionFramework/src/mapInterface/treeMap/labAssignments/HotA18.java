package mapInterface.treeMap.labAssignments;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HotA18 {

	/*
	 * 18. WAP to create a TreeMap with Integer as key and get a key-value mapping
	 * associated with the greatest key and the least key in a map.
	 * 
	 */

	public static void main(String[] args) {

		SortedMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(4, "sourabh");
		tmap.put(11, "suman");
		tmap.put(1, "suman");
		tmap.put(24, "simi");
		tmap.put(3, "suraj");
		tmap.put(2, "simi");
		tmap.put(35, "suraj");

		for (Map.Entry<Integer, String> e : tmap.entrySet()) {

			if (e.getKey() == tmap.firstKey()) {
				System.out.println("Entry having lower key value");
				System.out.println(e);
			}
			if (e.getKey() == tmap.lastKey()) {
				System.out.println("Entry having higher key value");
				System.out.println(e);
			}

		}

	}
}
