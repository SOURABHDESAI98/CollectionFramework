package collectionFramework.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorForArraylist {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sd");
		list1.add("gh");
		list1.add("ls");
		list1.add("sd");
		list1.add("ns");

// it is also called as universal iterator
		Iterator<String> itr = list1.iterator();

		// Iterator methods-

// 1. hasNext()- returns true if next element is present,returns false if not present,it starts with checking element at index zero

// 2. next()- returns next element but starts with index zero, if there is no next element then it returns NoSuchElementException

//3. remove()

//4.forEachRemaining()

		while (itr.hasNext()) {// starts with checking element at index zero

			System.out.println(itr.next());// starts from index zero
		}

	}

}
