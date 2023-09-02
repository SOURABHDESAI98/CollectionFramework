package collectionFramework.set.treeSet.labAssignments;

import java.util.TreeSet;

public class HotA8 {

	/*
	 * 8. WAP to retrieve and remove the lowest element of a TreeSet using a single
	 * method call. Repeat the same using 2 different method calls.
	 * 
	 */

	public static void main(String[] args) {

		TreeSet<String> tset = new TreeSet<String>();

		tset.add("sourabh");
		tset.add("suraj");
		tset.add("subodh");
		tset.add("simi");
		tset.add("sunil");
		tset.add("sukesh");

		System.out.println(tset.pollFirst());

		System.out.println(tset.pollLast());
	}
}
