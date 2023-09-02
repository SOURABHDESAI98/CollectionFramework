package mapInterface.hashMap.hashMapAssignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 
 * WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value 
values
 */

public class A5 {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Sourabh");
		hmap.put(2, "Sobodh");
		hmap.put(3, "Suraj");
		hmap.put(4, "Sunak");
		hmap.put(5, "sunil");

		Set<Map.Entry<Integer, String>> set = hmap.entrySet();

		for (Map.Entry<Integer, String> entry : set) {
			System.out.print(entry.getKey() + "=");
			System.out.print(entry.getValue() + " ");
			System.out.println();
		}

	}

}
