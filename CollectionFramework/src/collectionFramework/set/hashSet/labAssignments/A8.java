package collectionFramework.set.hashSet.labAssignments;

import java.util.HashSet;

public class A8 {

	/*
	 * 8. WAP to convert a HashSet to an array.
	 * 
	 */

	public static void main(String[] args) {

		HashSet<Integer> hSet = new HashSet<Integer>();

		hSet.add(10);
		hSet.add(18);
		hSet.add(28);
		hSet.add(9);
		hSet.add(38);

		Object obj[] = new Object[hSet.size()];

		obj = hSet.toArray();
		for (Object n : obj) {
			System.out.println(n);
		}

	}

}
