package collectionFramework.set.treeSet.labAssignments;

import java.util.NavigableSet;
import java.util.TreeSet;

public class HotA2A3A4A5A6 {
	/*
	 * 2. WAP to create a new TreeSet, add Strings and print the TreeSet .
	 * 
	 * 3. WAP to iterate through all elements in a TreeSet.
	 * 
	 * 4. WAP to get the first and last elements in a TreeSet.
	 * 
	 * 5. WAP to get the number of elements in a TreeSet.
	 * 
	 * 6. WAP to create a reverse order view of the elements contained in a given
	 * TreeSet.
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

		for (String n : tset) {
			System.out.println(n);
		}

		// first()
		System.out.println(tset.first() + " :first");

		// last()
		System.out.println(tset.last() + " :last");

		System.out.println(tset.size());

		System.out.println("----descending set----");
		NavigableSet<String> nset = tset.descendingSet();
		for (String n : nset) {
			System.out.println(n);
		}

	}

}
