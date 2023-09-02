package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;
import java.util.Arrays;

public class A21 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sd");
		list1.add("gh");
		list1.add("ls");
		list1.add("sd");
		list1.add("ns");

		String a[] = new String[list1.size()];

		for (int i = 0; i < list1.size(); i++) {
			a[i] = list1.get(i);

		}
		System.out.println(Arrays.toString(a));

	}

}
