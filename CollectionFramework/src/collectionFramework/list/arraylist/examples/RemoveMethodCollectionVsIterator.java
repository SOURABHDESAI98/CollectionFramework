package collectionFramework.list.arraylist.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveMethodCollectionVsIterator {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);

		// it will not show exception
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			if (itr.next() % 2 != 0) {
				itr.remove();
			}

		}

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		/*
		 * 
		 * // it will show exception
		 * 
		 * int a = list.size();
		 * 
		 * for (int i = 0; i < a; i++) {
		 * 
		 * if (list.get(i) % 2 != 0) { list.remove(i); } }
		 * 
		 * System.out.println(list);
		 */

	}

}
