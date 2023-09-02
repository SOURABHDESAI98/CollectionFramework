package collectionFramework.set.hashSet.labAssignments;

import java.util.HashSet;

public class A1A2 {
	/*
	 * 1. WAP to create a HashSet with Integer objects without using generics
	 * 
	 */

	public static void main(String[] args) {

		HashSet hSet = new HashSet();
		hSet.add(43);
		hSet.add(10);
		hSet.add(21);
		hSet.add(23);
		hSet.add(30);
		hSet.add(11);
		hSet.add(18);

		System.out.println(hSet);

		HashSet hSet2 = new HashSet();
		hSet2.add("red");
		hSet2.add("blue");
		hSet2.add("green");
		hSet2.add("yellow");
		hSet2.add("violet");
		hSet2.add("white");

		System.out.println(hSet2);

	}

}
