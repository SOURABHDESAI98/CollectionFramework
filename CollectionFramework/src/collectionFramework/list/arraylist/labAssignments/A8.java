package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class A8 {

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

		list.remove(10); // removes first occurrence

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i) == 10) {
				list.remove(i); // removes all 10
			}
		}
		System.out.println(list);

	}

}
