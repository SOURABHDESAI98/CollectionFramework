package mapInterface.hashMap.hashMapAssignments;

import java.util.HashMap;
import java.util.Map;

/*
 * WAP to add elements to a HashMap using generics with Integer as Key and String as value.
    And 4 key-value Map.Entry
 */
public class A3 {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Sourabh");
		hmap.put(2, "Sobodh");
		hmap.put(3, "Suraj");
		hmap.put(4, "Sunak");
		hmap.put(5, "sunil");

		for (Map.Entry<Integer, String> n : hmap.entrySet()) {
			System.out.println(n);
		}

	}

}
