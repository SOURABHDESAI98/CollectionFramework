package mapInterface.linkedHashMap.labAssigments;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
 * 9.WAP to create a LinkedhashMap with Integer as key and any other object as value. Now get 
a key-value mapping associated with the highest key and the least key in a map
 * 
 * 
 */

public class HotA9 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(4, "sourabh");
		lmap.put(5, "suraj");
		lmap.put(8, "sumit");
		lmap.put(2, "simi");

//1st way by using treeMap

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>(lmap);

		System.out.println(lmap.get(tmap.firstKey()) + " (entry having lowest key)");

		System.out.println(lmap.get(tmap.lastKey()) + " (entry having highest key)");

//2nd way by using min and max variables

		int min = 0;
		int max = 0;

		for (Integer e1 : lmap.keySet()) {

			if (e1 > max) {
				max = e1;
			}
		}

		System.out.println(lmap.get(max) + " (entry having highest key)");

		for (Integer e2 : lmap.keySet()) {

			if (e2 < max) {
				min = e2;
			}
		}

		System.out.println(lmap.get(min) + " (entry having lowest key)");

	}

}
