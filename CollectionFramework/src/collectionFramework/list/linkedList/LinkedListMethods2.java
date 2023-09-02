package collectionFramework.list.linkedList;

import java.util.LinkedList;

public class LinkedListMethods2 {

	public static void main(String[] args) {
		LinkedList<String> lin = new LinkedList<String>();

		lin.add("Peacemaker");
		lin.add("Black Adam");
		lin.add("HHH");
		lin.add("UnderTaker");

//13. addAll(index, Collection c)
		LinkedList<String> l2 = new LinkedList<String>();
		l2.add("l2 elem1");
		l2.add("l2 elem2");
		lin.addAll(1, l2);// list l2 is added at index 1

// 14. addFiest(), addLast()- both methods returns void
		lin.addFirst("last elem");

//15. getFirst()- if not found  then returns NoSuchElement Exception
		System.out.println(lin.getFirst());

//16. getLast()- if not found  then returns NoSuchElement Exception
		System.out.println(lin.getLast());

//17. offer()-it is like add() method both methods returns boolean value

		System.out.println(lin.offer("naruto"));

//17. offerFirst(), offerLast()- (Returns Boolean value) these are same as addFirst and addLast		

		lin.offerFirst("john wick");
//18. remove()/removeFirst()- it removes and returns the first element
		System.out.println(lin.remove());

//19. poll()/pollFirst()- it removes and returns the first element		
		System.out.println(lin.pollFirst());

//20. removeLast(), pollLast()- it removes and returns the last element	
		System.out.println(lin.pollLast());

//21. remove(index)-- it removes and returns element present at given index	
		lin.remove(1);

//22. peek(), peekFirst(), peekLast()- same as get, getFirst and getLast
		// but peek methods returns null if nothing is found while get methods throws
		// NoSuchElementException
		System.out.println(lin.peek());
		System.out.println(lin.peekLast());

	}
}
