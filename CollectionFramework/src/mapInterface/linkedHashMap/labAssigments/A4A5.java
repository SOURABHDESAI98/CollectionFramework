package mapInterface.linkedHashMap.labAssigments;

import java.util.LinkedHashMap;
import java.util.Map;

public class A4A5 {

	/*
	 * 4. WAP to create a LinkedHashMap which contains Integers as key and Strings
	 * as value. Print the map contents and observe the order. Use generics.
	 * 
	 * 5. WAP to create a LinkedHashMap which contains Strings as key and Integers
	 * as value. Print the map contents and observe the order. Use generics.
	 * 
	 */

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lMap = new LinkedHashMap<Integer, String>();
		lMap.put(1, "sourabh");
		lMap.put(7, "suraj");
		lMap.put(5, "simaran");
		lMap.put(9, "siddhi");
		lMap.put(2, "sumit");

		for (Map.Entry<Integer, String> e : lMap.entrySet()) {

			System.out.print(e.getKey() + " ");
			System.out.print(e.getValue());
			System.out.println();
		}

		LinkedHashMap<String, Integer> lMap2 = new LinkedHashMap<String, Integer>();
		lMap2.put("sourabh", 1);
		lMap2.put("suraj", 7);
		lMap2.put("simaran", 8);
		lMap2.put("siddhi", 6);
		lMap2.put("sumit", 4);

		System.out.println("--------------");
		for (Map.Entry<String, Integer> e : lMap2.entrySet()) {

			System.out.print(e.getKey() + " ");
			System.out.print(e.getValue());
			System.out.println();
		}

	}

}
