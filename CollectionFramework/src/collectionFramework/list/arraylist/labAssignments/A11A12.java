package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class A11A12 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sd");
		list1.add("gh");
		list1.add("ls");
		list1.add("sd");
		list1.add("ns");

		System.out.println(list1.size());
		boolean b = list1.isEmpty();
		if (b) {
			System.out.println("List is empty");
		} else {
			System.out.println("List is not empty");
		}

		list1.removeAll(list1);
		System.out.println(list1);
	}

}
