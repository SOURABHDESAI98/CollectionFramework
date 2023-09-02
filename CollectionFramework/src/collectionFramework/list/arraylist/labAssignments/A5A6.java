package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class A5A6 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(16);
		list.add(35);
		list.add(20);

		for (int i = 0; i < list.size(); i++) {

			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		for (Integer n : list) {
			System.out.print(n + " ");
		}
	}

}
