package collectionFramework.list.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorForArraylist {
	// 1. it is only applicable for list collection

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sd");
		list1.add("gh");
		list1.add("ls");
		list1.add("sd");
		list1.add("ns");

		// list iterator methods-
		/*
		 * 1.next() 2.hasNext() 3.previous() 4.hasPrevious() 4.remove() 5.nextIndex()
		 * 6.previousIndex() 7.set() 8.add()
		 * 
		 */

		ListIterator<String> lit = list1.listIterator();

		System.out.println("--------forward----------");
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}

		System.out.println("--------backward----------");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}

}
