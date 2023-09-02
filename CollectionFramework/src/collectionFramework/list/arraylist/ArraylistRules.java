package collectionFramework.list.arraylist;

import java.util.ArrayList;

public class ArraylistRules {

	/*
	 * 1. it is a class of collection framework, it is also called dynamic array
	 * 
	 * 2. it is dynamic array i.e size is growable
	 * 
	 * 3. extends AbstractList, implements List, RandomAccess, Clonable,
	 * Serializable
	 * 
	 * 4. Arraylist constructors
	 * 
	 * * Arraylist() - if capacity is not mentioned then it will take initial
	 * capacity as 10
	 * 
	 * * Arraylist(int capacity)
	 * 
	 * * Arraylist(collection c)
	 * 
	 * 5. Arraylist is non synchronised
	 * 
	 */

	// initialization

	/*
	 * when you use <ClassNmae> instead of <Integer> then you can use heterogeneous
	 * data in generic list
	 * 
	 * 1.1st way
	 * 
	 * ArrayList<ClassName> list = new ArrayList<ClassName>(); // < > IS USED AS
	 * COLLECTION SYMBOL
	 * 
	 * 2.2nd way, this is better way
	 * 
	 * List<ClassName> list = new ArrayList<ClassName>();
	 * 
	 * 
	 */

	public static void nonGenericList() {

		// it is not recommended because it cause type safety problem

		// it constructs empty list with initial capacity of 10
		ArrayList list = new ArrayList(); // this is non generic list, i.e it can has heterogeneous objects
		System.out.println(list);
		// these primitive arguments are automatically converted to their respected
		// wrapper class
		list.add(22);
		list.add("Sourabh");
		list.add(22.22);
		list.add(22.22f);
		list.add(true);
		list.add('s');
		System.out.println(list);

		// get method
		System.out.println(list.get(0));

		// size method
		System.out.println(list.size());

		// non generic list using for loop

		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + " ");
		}

// type safety- whenever we fetch data using get() method in non-generic 	 collection

// type safety problem
		double d = (double) list.get(2); // you need to do type casting in non generic

		// Arraylist using for-each loop

		for (Object a : list) {
			System.out.print(a + " ");
		}

	}

	public static void genericList() {

		// generic arraylist- only homogenous objects is stored
		ArrayList<Integer> list1 = new ArrayList<Integer>();
// when you use <ClassNmae> instead of <Integer> then you can use heterogeneous data in generic list

		list1.add(18);
		list1.add(10);
		list1.add(10);// list accepts duplicate values
		list1.add(null);// list accepts multiple null values
		list1.add(null);

		int i = list1.get(0); // no need to do type casting here
		System.out.println(i);

		/// for each loop for generic list
		System.out.println();
		for (Integer s : list1) {
			System.out.print(s + " ");
		}

		list1.add(28);
		list1.add(20);
		list1.add(21);
		list1.add(22);

		// generic list using for loop
		System.out.println();
		for (int j = 0; j < list1.size(); j++) {

			System.out.print(list1.get(j) + " ");
		}
		System.out.println(
				" (list is growable in nature and capacity is increased) \nnew capacity of list=(3/2* old capacity)+1");

	}

	public static void main(String[] args) {
		nonGenericList();
		genericList();
	}

}
