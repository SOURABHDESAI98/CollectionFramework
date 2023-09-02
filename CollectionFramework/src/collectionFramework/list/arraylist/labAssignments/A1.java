package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class A1 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(15);
		list.add(16);
		list.add(35);
		list.add(20);

		for (Object n : list) {
			System.out.print(n + " ");
		}

		System.out.println();

		ArrayList list1 = new ArrayList();
		list1.add("sd");
		list1.add("yu");
		list1.add("ty");
		list1.add("nsd");
		list1.add("ugsf");

		for (Object n : list1) {
			System.out.print(n + " ");
		}

	}

}
