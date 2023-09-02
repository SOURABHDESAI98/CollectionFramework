package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class A4 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(16);
		list.add(35);
		list.add(20);

		ListIterator<Integer> itr = list.listIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
