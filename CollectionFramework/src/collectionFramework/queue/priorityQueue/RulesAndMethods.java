package collectionFramework.queue.priorityQueue;

import java.util.PriorityQueue;

public class RulesAndMethods {

	/*
	 * 1.it follows FIFO
	 * 
	 * 2.head(front), tail(rear)
	 * 
	 * 3.it does not follows insertion order, it sorts by using binary tree
	 * structure
	 * 
	 * 4.it accepts duplicate values
	 * 
	 * 5. it follows binary tree structure
	 * 
	 * 6. it does not accepts null
	 * 
	 * 7. default capacity is 11
	 * 
	 * 8.it does not follows insertion order so elements can not be accessed by
	 * using their indices unlike list, queue doesn't have get() method
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		pQueue.add(10);
		pQueue.add(85);
		pQueue.add(40);
		pQueue.add(75);
		pQueue.add(55);
		pQueue.add(55);// accepts duplicate values, doesn't accept null

		System.out.println(pQueue);

		/*
		 * 
		 */

//1.offer()- it is like add() method

		// 2.remove(element)- it removes given element, returns boolean
		System.out.println(pQueue.remove(55) + " :only one 55 is removed");
		System.out.println(pQueue);

//3.remove()- it removes head of queue, returns that element,if queue is empty it returns NoSuchElementException

		System.out.println(pQueue.remove());

//4.poll()- it removes head of queue, returns that element,if queue is empty it returns null
		System.out.println(pQueue.poll());

//5.peek()- it returns head of queue, but doesn't remove it, if queue is empty it returns null

	}

}
