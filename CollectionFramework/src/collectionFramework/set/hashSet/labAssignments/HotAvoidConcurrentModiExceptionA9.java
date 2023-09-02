package collectionFramework.set.hashSet.labAssignments;

import java.util.HashSet;
import java.util.Iterator;

public class HotAvoidConcurrentModiExceptionA9 {
	/*
	 * 
	 * 9. WAP to remove all of the elements from a HashSet.
	 * 
	 */

	public static void main(String[] args) {

		HashSet<Integer> hSet = new HashSet<Integer>();

		hSet.add(10);
		hSet.add(18);
		hSet.add(28);
		hSet.add(9);
		hSet.add(38);

		Iterator<Integer> itr = hSet.iterator();

		while (itr.hasNext()) {
			itr.next();
			itr.remove();
		}

		System.out.println(hSet.isEmpty());
	}

}
