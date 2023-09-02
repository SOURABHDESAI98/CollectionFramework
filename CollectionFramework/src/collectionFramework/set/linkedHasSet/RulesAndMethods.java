package collectionFramework.set.linkedHasSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RulesAndMethods {
	/*
	 * * 1. it is used when we don't want duplicate values
	 * 
	 * 2. it follows internal data structure doubly linkedlist and hashtable because
	 * it's default constructure creates linked hashmap
	 * 
	 * 3. it follows insertion order so null will not be placed at 0th index
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		LinkedHashSet<String> lset = new LinkedHashSet<String>();
		lset.add("sourabh");
		lset.add("neha");
		lset.add("pooja");
		lset.add(null);// null value will not be placed at 0th index because linkedhashmap follows
						// insertion order
		lset.add("sourabh"); // duplicate values are not taken

		System.out.println(lset);

		System.out.println("by using for each loop");
		for (String s : lset) {
			System.out.println(s);
		}

		Iterator<String> itr = lset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
