package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class A22A23 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sd");
		list1.add("gh");
		list1.add("ls");
		list1.add("sd");
		list1.add("ns");

		System.out.println(list1);

		String temp = list1.get(1);
		list1.set(1, list1.get(2));
		list1.set(2, temp);

		System.out.println(list1);
		list1.set(2, "@#$%");
		System.out.println(list1);

	}

}
