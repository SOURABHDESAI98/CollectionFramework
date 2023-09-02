package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassMethods {

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

//4. swap()- it swaps positions of two elements

		Collections.swap(list, 0, 1);
		System.out.println(list);

//5. addAll()- array to list

		String str1[] = { "steu", "gdsi", "ugea" };
		List<String> clist = new ArrayList<String>();

		Collections.addAll(clist, str1);
		System.out.println(clist + "...array to list by using collections class");

//6. synchroniseList()

		Collections.synchronizedList(list);

//7. synchroniseCollection()	
		Collections.synchronizedList(list);
		System.out.println(list);

	}

}
