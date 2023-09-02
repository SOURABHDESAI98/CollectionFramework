package collectionFramework.list.arraylist.examples;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassMethod {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(10);
		list.add(16);
		list.add(35);
		list.add(20);
		list.add(65);
		list.add(23);
		list.add(10);

//1.sort()- it sorts in ascending order
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list + " ascending sort");

//2. reverse()- it reverses elements
		Collections.reverse(list);
		System.out.println(list + " reversed");

//3. shuffle()- it shuffles in random order

		Collections.shuffle(list);
		System.out.println(list + " shuffled randomly");

	}

}
