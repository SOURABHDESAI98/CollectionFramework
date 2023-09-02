package collectionFramework.set.hashSet.labAssignments;

import java.util.HashSet;

public class A4A5A6A7 {

	/*
	 * 
	 * 4. WAP to iterate through all elements in a HashSet and print the elements.
	 * Observe the order of elements.
	 * 
	 * 5. WAP to get the number of elements in a HashSet.
	 * 
	 * 6. WAP to empty a HashSet.
	 * 
	 * 7. check it's empty or not
	 * 
	 */

	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet<Integer>();

		hSet.add(10);
		hSet.add(18);
		hSet.add(28);
		hSet.add(9);
		hSet.add(38);

		for (Integer n : hSet) {
			System.out.println(n);
		}

		System.out.println(hSet.size());

		hSet.clear();
		System.out.println(hSet.isEmpty());

	}

}
