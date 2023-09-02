package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class A16A17 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sd");
		list1.add("gh");
		list1.add("ls");
		list1.add("sd");
		list1.add("ns");

		System.out.println(list1.get(2));
		list1.add(2, "lsd");
		System.out.println(list1);

	}

}
