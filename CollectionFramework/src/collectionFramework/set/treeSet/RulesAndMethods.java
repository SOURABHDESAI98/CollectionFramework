package collectionFramework.set.treeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class RulesAndMethods {
	/*
	 * 1. it follows internal data structure of treeMap
	 * 
	 * 2. treeSet/sortedSet doesn't accept duplicate objects of same custom class
	 * unlike hashSet/linkedhashSet so you don't need to override equals() method in
	 * custom class of those objects in case of treeSet/sortedSet
	 *
	 */

	public static void main(String[] args) {

		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(45);
		tset.add(17);
		tset.add(20);
		tset.add(102);
		tset.add(29);
		tset.add(88);
//1.first(), last()		
		System.out.println(tset.first());
		System.out.println(tset.last());

//2.higher()- higher than given value

//3.lower()- lower than given value

//4.floor()- returns same value or lower value if given value is not present

//5.ceiling()- returns same value or higher value if given value is not present

//6.subSet()
		System.out.println(tset.subSet(20, 45) + " :subSet(20,45)");

// 7.headSet()
		System.out.println(tset.headSet(45) + " :headSet(45)");

// 8.tailSet()
		System.out.println(tset.tailSet(45) + " :tailSet(45)");

// 9.descendingSet()

		NavigableSet<Integer> nset = tset.descendingSet();

		System.out.println(nset + " descending order");
// 10.pollFirst()- retrieve and remove first element- according to ascending order only

		System.out.println(tset.pollFirst());
// 11.pollLast()- retrieve and remove last element- according to ascending order only

		System.out.println(tset.pollLast());
// 12.pollFirst for descending order

		System.out.println(tset.descendingSet().pollFirst());

// 13.pollLast for descending order
		System.out.println(tset.descendingSet().pollLast());

	}

}
