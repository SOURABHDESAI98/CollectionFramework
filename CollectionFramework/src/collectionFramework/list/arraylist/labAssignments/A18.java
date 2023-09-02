package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class A18 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			list.add(i);
		}

		for (Integer n : list) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}

	}

}
