package collectionFramework.list.linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListRulesMethods {

	/*
	 * 1.LinkedList implements the doubly linked list of the list interface.
	 * 
	 * 2. Linkedlist inherits list interface and implements Deque interface so it
	 * contains methods of these both interfaces
	 * 
	 * 3. Linkedlist is non synchronised
	 * 
	 * 4. linkedlist has all methods of arraylist because both are childs of list
	 * and grandChilds of collection interface
	 * 
	 * 5. linkedlist can be used as arraylist, Queue,stack,singly-doubly-circularly
	 * linkedlist
	 * 
	 */

	public static void main(String[] args) {
		LinkedList<String> lin = new LinkedList<String>();

		lin.add("Peacemaker");
		lin.add("Black Adam");
		lin.add("HHH");
		lin.add("UnderTaker");

//1.1 addFirst()
		lin.addFirst("brock lesnar");
		System.out.println(lin);

//1.2 offerFirst()- it is same as addFirst but it returns boolean value
		lin.addFirst("baba yaga");
		System.out.println(lin);

//2. addLast()
		lin.addLast("Thanos");
		System.out.println(lin);

//3. removeFirst()
		lin.removeFirst();
		System.out.println(lin);

//4. removeFirst()
		lin.removeLast();
		System.out.println(lin);

//5. getFirst()
		System.out.println(lin.getFirst());

//6. getLast()
		System.out.println(lin.getLast());

//7.set()
		lin.set(0, "eminem");

//8. toArray()	

		Object obg[] = lin.toArray();

		String str[] = new String[lin.size()];

		str = lin.toArray(str);

// 9.isEmpty()
		System.out.println(lin.isEmpty());

//10.addAll

		String str1[] = { "sd", "da", "trdts", "iyv" };

		List<String> lin2 = new ArrayList<String>(Arrays.asList(str1));

		lin.addAll(lin2);

//11. retainsAll()

		lin.retainAll(lin2);

//12. indexOf(), lastIndexOf()
		System.out.println(lin.indexOf("sd"));
		System.out.println(lin.lastIndexOf("Thanos"));

	}

}
