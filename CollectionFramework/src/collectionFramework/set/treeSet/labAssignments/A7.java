package collectionFramework.set.treeSet.labAssignments;

import java.util.TreeSet;

public class A7 {
	/*
	 * 7. WAP to remove a given element from a TreeSet.
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

		tset.remove("sourabh");
		System.out.println(tset);

	}

}
