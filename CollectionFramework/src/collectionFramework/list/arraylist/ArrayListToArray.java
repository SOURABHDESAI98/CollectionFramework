package collectionFramework.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(10);
		alist.add(12);
		alist.add(8);
		alist.add(111);
		alist.add(104);

// arraylist to array
		Integer a[] = new Integer[alist.size()];

		alist.toArray(a);

		System.out.println(Arrays.toString(a));

//array to arraylist

		String b[] = { "sourabh", "john cena", "shaktiman", "john wick" };

		List<String> aList2 = new ArrayList<String>();
		// 1st way
		aList2 = Arrays.asList(b);

		System.out.println(aList2);

		// 2nd way
		Collections.addAll(aList2, b);

		// 3rd way
		List<String> aList3 = new ArrayList<String>(Arrays.asList(b));

	}
}
