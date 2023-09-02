package collectionFramework.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistMethods3 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sd");
		list1.add("gh");
		list1.add("ls");
		list1.add("sd");
		list1.add("ns");

//11. toArray()- arraylist to array		
		Object obj[] = new Object[list1.size()];
		obj = list1.toArray(); // because this method returns object array(non primitive)

		System.out.println("--toArray()---");
		for (Object n : obj) {
			System.out.print(n + " ");
		}
		System.out.println();

		String str[] = new String[list1.size()];
		list1.toArray(str); // converts to string array(primitive)

		System.out.println("--toArray()---");
		for (String n : str) {
			System.out.print(n + " ");
		}
		System.out.println();

//12. array to Arraylist

		String str1[] = { "steu", "gdsi", "ugea" };

		List<String> li = new ArrayList<String>();// creates immutable list, i.e you can't add more elements in list

		li = Arrays.asList(str1); // returns list

		System.out.println(li + "...non mutable");

		// this creates mutable list i.e you can add more elements in list lis
		List<String> lis = new ArrayList<String>(Arrays.asList(str1));
		lis.add("new element");
		System.out.println(lis + "...mutable");

		// by using collections class

		List<String> clist = new ArrayList<String>();

		Collections.addAll(clist, str1);
		System.out.println(clist + "...by using collections class");

//13.clone

		Object list2 = new ArrayList<Integer>(); // object is root class of all classes in java

		list2 = list1.clone();
		System.out.println(list2);

//14.subList(from index, to index)

	}

}
