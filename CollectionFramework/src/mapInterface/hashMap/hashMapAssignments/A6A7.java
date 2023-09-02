package mapInterface.hashMap.hashMapAssignments;
/*
 * 
 * WAP to get only the Keys from a HashMap
 * 
 * WAP to get only the Values from a HashMap
 * 
 * 
 */

import java.util.HashMap;
import java.util.Set;

public class A6A7 {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Sourabh");
		hmap.put(2, "Sobodh");
		hmap.put(3, "Suraj");
		hmap.put(4, "Sunak");
		hmap.put(5, "sunil");

		Set<Integer> set = hmap.keySet();

		for (Integer n : set) {
			System.out.print(n + "=");
			System.out.println(hmap.get(n));
			System.out.println();
		}

	}

}
