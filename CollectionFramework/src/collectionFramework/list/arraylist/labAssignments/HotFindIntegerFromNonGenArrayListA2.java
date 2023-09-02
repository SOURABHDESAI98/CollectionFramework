package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class HotFindIntegerFromNonGenArrayListA2 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(10);
		list.add("sourabh");

		Object a = list.get(0);
		System.out.println(a);// 10

		Object b = list.get(1);
		System.out.println(b);// sourabh

		// type safety problem, so non generic arraylist is not recommended
		int n = (int) list.get(0);
		String str = (String) list.get(1);

		// finding integer from non generic arraylist

		System.out.println("Integers from arraylist :");
		for (Object m : list) {

			if (m instanceof Integer) {
				System.out.println(m);
			}

		}

	}

}
