package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class A10 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sd");
		list1.add("gh");
		list1.add("ls");
		list1.add("sd");
		list1.add("ns");

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("fg");
		list2.add("gh");
		list2.add("kl");
		list2.add("ns");

		System.out.println("-------------retainAll--------------");
		System.out.println(list1);
		System.out.println(list2);

		list1.retainAll(list2);
		System.out.println(list1 + " (gh is repeated)");

	}

}
