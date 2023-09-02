package collectionFramework.list.arraylist;

import java.util.ArrayList;

public class ArraylistMethods2 {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sd");
		list1.add("gh");
		list1.add("ls");
		list1.add("sd");
		list1.add("ns");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("fg");
		list2.add("gh");
		list2.add("kl");
		list2.add("ns");

//7.addAll(Collection c)
		list1.addAll(list2);
		System.out.println("----------addAll()-----------");
		System.out.println(list1);

//8.containsAll(Collection c)
		boolean b = list1.containsAll(list2);// true

//9. retainAll(Collection c);- keeps common element between two arraylists,also keeps duplicate elements
		System.out.println("-------------retainAll--------------");
		System.out.println(list1);
		System.out.println(list2);

		list1.retainAll(list2);
		System.out.println(list1 + " (gh is repeated)");

//10.remove()
		System.out.println("-------------remove--------------");
		list1.add(null);
		System.out.println(list1);
		String st = list1.remove(0);// returns string
		System.out.println(list1 + " (element at index 0 is removed)");
		boolean bl = list1.remove("ns"); // returns boolean
		System.out.println(list1 + " (first occurance of ns is removed)");
		boolean b2 = list1.remove(null); // returns boolean
		System.out.println(list1 + " (removes null too)");

	}

}
