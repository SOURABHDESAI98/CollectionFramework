package collectionFramework.queue.Dequeue.arrayDeque;

import java.util.ArrayDeque;

public class RulesAndMethods {

	/*
	 * 1. it follows insertion order
	 * 
	 * 2. it accepts duplicate values, it doesn't accept null values
	 * 
	 * 3. it can act as LIFO and FIFO, because you can add and remove from first and
	 * last
	 * 
	 * 
	 */

	public static void main(String[] args) {

		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(10);
		ad.add(50);
		ad.add(85);
		ad.add(95);
		ad.add(45);
		ad.add(25);
		ad.add(25);
		ad.add(95);

		System.out.println(ad);

		ad.addFirst(25);

		ad.addLast(95);

		System.out.println(ad.remove());

		System.out.println(ad.removeFirst());

		System.out.println(ad.removeLast());

		System.out.println(ad.removeFirstOccurrence(95));

		System.out.println(ad.removeLastOccurrence(95));

		System.out.println(ad.getFirst());

		System.out.println(ad.getLast());

// push()
		ad.push(12);// add at starting FIFO
		ad.push(12);

// pop()
		ad.pop();// remove from starting FIFO

		System.out.println(ad);

		System.out.println(ad.pollFirst());

		System.out.println(ad.pollLast());

	}

}
