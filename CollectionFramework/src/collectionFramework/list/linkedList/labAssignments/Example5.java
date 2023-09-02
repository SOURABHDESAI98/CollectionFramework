package collectionFramework.list.linkedList.labAssignments;

import java.util.LinkedList;

public class Example5 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("Peacemaker");
		list.add("Black Adam");
		list.add("HHH");
		list.add("UnderTaker");
		list.add("shaktiman");
		list.add("spiderman");
		list.add("HHH");
		list.add("Black Adam");

		System.out.println(list);

		LinkedList<String> list2 = new LinkedList<String>();

		int count;
		for (int i = 0; i < list.size(); i++) {
			count = 0;

			if (list2.contains(list.get(i))) {
				continue;
			}

			for (int j = 0; j < list.size(); j++) {

				if (list.get(i).equals(list.get(j))) {
					count++;

				}
			}

			if (count > 1) {
				list2.add(list.get(i));
				list.removeFirstOccurrence(list.get(i));
			}
		}

		System.out.println(list);

	}

}
