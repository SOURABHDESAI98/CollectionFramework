package collectionFramework.list.vector.stack;

import java.util.Stack;

public class RulesAndMethods {
	/*
	 * 1. it is last in first out
	 * 
	 * 2. As Stack works on LIFO logic so pop method will remove element present at
	 * top at the stack and push method will add element at the top of the stock
	 * 
	 * 3. as linkedlist implements Deque which is child of queue which works on FIFO
	 * logic so pop will remove first element and push will add element at 0th index
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
//1. push()
		st.push(10);// index 0
		st.push(11);
		st.push(12);
		st.push(13);
		st.push(14);
		st.push(15);// index=st.size()-1 (Top of the stack)

//2. indexOf()

		System.out.println(st.indexOf(10));// 0

// 3.search()- it returns index of given element, if element is not present then it returns -1

		System.out.println(st.search(10));// 6
		System.out.println(st.search(15));// 1

//4.pop()- it returns top of the stack 
		st.pop();
		System.out.println(st);

//5.add()- it adds element at last		

		st.add(16);
		System.out.println(st);

	}

}
