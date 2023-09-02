package mapInterface.linkedHashMap.labAssigments;

import java.util.LinkedHashMap;

/*
 * 
 * 
 * 1. WAP to create a LinkedHashMap which contains Integers as key and Strings as value. Print 
    the map contents and observe the order. Don’t use generics.
 */

public class A1 {

	public static void main(String[] args) {

		LinkedHashMap lmap = new LinkedHashMap();
		lmap.put(1, "sourabh");
		lmap.put(7, "suraj");
		lmap.put(3, "subodh");
		lmap.put(4, "sima");

		System.out.println(lmap);

	}

}
