package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;

public class HotSearchCollectionInCollectionA15 {

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

		list1.addAll(list2);

		boolean b = list1.containsAll(list2);

		if (b) {
			System.out.println("list 1 contains list 2");
		} else {
			System.out.println("list 1 does not contains list 2");
		}

	}

}
