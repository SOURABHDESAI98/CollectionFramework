package mapInterface.treeMap.labAssignments;

import java.util.SortedMap;
import java.util.TreeMap;

public class A10 {
	/*
	 * 1.WAP to create a Treemap which contains Integers
	 * 
	 */

	public static void main(String[] args) {

		SortedMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		tmap.put(4, 104);
		tmap.put(1, 101);
		tmap.put(3, 103);
		tmap.put(2, 102);

		System.out.println(tmap);

	}

}
