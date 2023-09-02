package collectionFramework.list.linkedList.labAssignments;

import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1234);
		list1.add(57);
		list1.add(63);
		list1.add(873);
		list1.add(123);
		list1.add(234);

		int max = list1.get(0);

		for (int i = 1; i < list1.size(); i++) {
			if (list1.get(i) > max) {
				max = list1.get(i);
			}
		}
		System.out.println("Max Value :" + max);

		int min = list1.get(0);

		for (int i = 1; i < list1.size(); i++) {
			if (list1.get(i) < min) {
				min = list1.get(i);
			}
		}
		System.out.println("Min Value :" + min);

	}

}
