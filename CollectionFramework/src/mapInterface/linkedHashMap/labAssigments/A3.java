package mapInterface.linkedHashMap.labAssigments;

import java.util.LinkedHashMap;

public class A3 {

	/*
	 * 
	 * 
	 * 3.WAP to create a LinkedHashMap which contains Strings as key and objects of
	 * different classes as value. Print the map contents and observe the order.
	 */

	public static void main(String[] args) {

		LinkedHashMap lmap = new LinkedHashMap();
		lmap.put("sourabh", 1);
		lmap.put(7, "suraj");
		lmap.put("subodh", 3.02);
		lmap.put("sima", 4.4f);
		lmap.put(23.34, 4.4f);

		System.out.println(lmap);

	}

}
