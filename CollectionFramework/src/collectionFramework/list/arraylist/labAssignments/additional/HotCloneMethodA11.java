package collectionFramework.list.arraylist.labAssignments.additional;

import java.util.ArrayList;

public class HotCloneMethodA11 {

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

		Object list2 = new ArrayList<Integer>(); // object is root class of all classes in java

		list2 = list.clone();
		System.out.println(list2);

	}

}
