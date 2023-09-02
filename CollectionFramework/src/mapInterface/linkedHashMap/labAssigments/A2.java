package mapInterface.linkedHashMap.labAssigments;

import java.util.LinkedHashMap;

public class A2 {

	/*
	 * 
	 * 2. WAP to create a LinkedHashMap which contains Strings as key and Integers
	 * as value. Print the map contents and observe the order. Don’t use generics.
	 */

	public static void main(String[] args) {

		LinkedHashMap lmap = new LinkedHashMap();
		lmap.put("sourabh", 1);
		lmap.put("suraj", 7);
		lmap.put("subodh", 3);
		lmap.put("sima", 4);

		System.out.println(lmap);

	}

}
