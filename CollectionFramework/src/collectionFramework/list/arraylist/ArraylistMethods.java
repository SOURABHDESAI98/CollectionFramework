package collectionFramework.list.arraylist;

import java.util.ArrayList;

public class ArraylistMethods {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("sd");
		list.add("gh");
		list.add("ls");
		list.add("sd");
		System.out.print(list);

//1. add()-it adds element at given index and moves further already existing element at that index
		System.out.println(" (size" + list.size() + ")");
		list.add(2, "added");//
		System.out.print(list);
		System.out.println(" (size" + list.size() + ")");

//2. set()-it replaces element at given index
		list.set(2, "removed");
		System.out.print(list);
		System.out.println(" (size" + list.size() + ")");

//3. indexOf(), lastIndexOf()	

		int a = list.indexOf("sd"); // index of first occurrence
		int b = list.lastIndexOf("sd");// index of first occurrence

//4. isEmpty()		
		boolean c = list.isEmpty();// false

//5.contains()
		boolean d = list.contains("ls");// true

//6.clear()

		list.clear();// clears all list
		System.out.println(list);

//7.getClass()- this is actually method of Object class, override by Collection Interface
		System.out.println(list.getClass());
	}

}
