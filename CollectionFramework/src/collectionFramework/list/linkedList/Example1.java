package collectionFramework.list.linkedList;

import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		list.add("spiderman");
		list.add("shaktiman");
		list.add("batman");
		list.add("killmada");
		list.add("thanos");

		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("spiderman");
		list1.add("superman");
		list1.add("batman");

		boolean flag;

		System.out.println("Unique Elements :");
		for (String n : list) {
			flag = true;
			for (String m : list1) {

				if (n.contains(m)) {
					flag = false;

				}

			}
			if (flag) {
				System.out.println(n);
			}

		}
	}
}
