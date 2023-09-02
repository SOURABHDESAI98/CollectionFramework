package collectionFramework.list.arraylist;

import java.util.ArrayList;

public class DuplicateUniqueElements {

	public static void main(String[] args) {

		ArrayList<String> aList1 = new ArrayList<String>();
		aList1.add("html");
		aList1.add("java");
		aList1.add("python");
		aList1.add("css");
		aList1.add("ruby");

		ArrayList<String> aList2 = new ArrayList<String>();
		aList2.add("html");
		aList2.add("css");
		aList2.add("javascript");
		aList2.add("c#");
		aList2.add("ruby");

		// aList1.retainAll(aList2);
		// System.out.println("List 3 :" + aList1);

		ArrayList<String> uniqueList = new ArrayList<String>();

		for (String s1 : aList1) {

			if (aList2.contains(s1)) {

			} else {
				uniqueList.add(s1);
			}
		}

		for (String s2 : aList2) {

			if (aList1.contains(s2)) {

			} else {
				uniqueList.add(s2);
			}
		}

		System.out.println(uniqueList);

	}

}
