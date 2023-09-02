package collectionFramework.set.treeSet.labAssignments;

import java.util.HashSet;
import java.util.TreeSet;

public class A1 {

	/*
	 * 1. WAP to create a TreeSet from a HashSet.
	 * 
	 */

	public static void main(String[] args) {

		HashSet<Integer> hSet = new HashSet<Integer>();

		hSet.add(10);
		hSet.add(18);
		hSet.add(28);
		hSet.add(9);
		hSet.add(38);

		TreeSet<Integer> tset = new TreeSet<Integer>(hSet);
		System.out.println(tset);

	}

}
