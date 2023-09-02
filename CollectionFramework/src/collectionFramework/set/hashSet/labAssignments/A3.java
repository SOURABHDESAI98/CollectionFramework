package collectionFramework.set.hashSet.labAssignments;

import java.util.ArrayList;
import java.util.HashSet;

public class A3 {

	/*
	 * 3. WAP to create a HashSet from an ArrayList
	 */

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(null);
		alist.add(10);
		alist.add(12);
		alist.add(18);
		alist.add(null);
		alist.add(10);
		alist.add(19);
		alist.add(18);
		alist.add(28);

		HashSet<Integer> hset = new HashSet<Integer>(alist);

	}

}
