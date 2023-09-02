package collectionFramework.list.linkedList;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListVsStack {

	/*
	 * 1 As Stack works on LIFO logic so pop method will remove element present at
	 * top at the stack and push method will add element at the top of the stock
	 * 
	 * 2. as linkedlist implements Deque which is child of queue which works on FIFO
	 * logic so pop will remove first element and push will add element at 0th index
	 * 
	 * 
	 * 3. 3 Rules you need to follow for both LinkedList and Stack
	 * 
	 * 1. for push, pop focus on FIFO & LIFO logic
	 * 
	 * 2. add will always add element at last for both linkedlist and stack
	 * 
	 * 3. for both, first means element at index 0 and last means element at index
	 * size()-1
	 * 
	 * eg- getFirst(peekFirst) ,getLast(peekLast),pollFirst(removeFirst)
	 * ,pollLast(removeLast) , firstElement(), lastElement() etc.
	 * 
	 */

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("spiderman");
		list.add("shaktiman");
		list.add("batman");
		list.add("killmada");
		list.add("thanos");

		System.out.println("-----------LinkedList-----------");
		list.pop();
		list.push("element pushed");
		System.out.println(list + " LinkedList push and pop");

		list.addLast("add last/add"); // add last(add)
		System.out.println(list);

		list.addFirst("add First");
		System.out.println(list);

		// same for peekFirst(getFirst)
		// ,peekLast(getLast),pollFirst(removeFirst),pollLast(removeLast)

		Stack<Integer> st = new Stack<Integer>();

		st.push(10);
		st.push(11);
		st.push(12);
		st.push(13);
		st.push(14);
		st.push(15);

		System.out.println("-----------stack-----------");
		System.out.println(st);
		st.pop();
		System.out.println(st + " :pop");
		System.out.println("last element :" + st.lastElement());

		System.out.println(st.get(0) + " :get(0)");

		st.add(9);
		System.out.println(st + " :add(9)");

		System.out.println(st.firstElement() + " :first element");
		System.out.println(st.lastElement() + " :Last element");
	}

}
