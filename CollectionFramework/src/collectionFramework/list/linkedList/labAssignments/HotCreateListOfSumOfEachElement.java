package collectionFramework.list.linkedList.labAssignments;

import java.util.LinkedList;

public class HotCreateListOfSumOfEachElement {

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1234);
		list1.add(57);
		list1.add(63);
		list1.add(873);
		list1.add(123);
		list1.add(234);

		LinkedList<Integer> list2 = new LinkedList<Integer>();

		int number, digit;
		int sum, sum2;

		for (int i = 0; i < list1.size(); i++) {
			sum = sum2 = 0;
			number = list1.get(i);
			while (number > 0) {
				digit = number % 10;
				sum = sum + digit;
				number = number / 10;
			}

			if (sum / 10 > 0) {

				while (sum > 0) {
					digit = sum % 10;
					sum2 = sum2 + digit;
					sum = sum / 10;
				}
				list2.add(sum2);
			} else {
				list2.add(sum);
			}
		}

		for (Integer n : list2) {
			System.out.println(n);
		}
	}

}
