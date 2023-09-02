package mapInterface.hashMap.hashMapAssignments;

import java.util.HashMap;

public class A1 {
	/*
	 * WAP to add elements to a HashMap without using generics (ie do not use <>)
	 * and print content of it. Use Integer as Key and String as Value. In second
	 * HashMap add elements of String type as Key and Integer as Value.
	 * 
	 */

	public static void main(String[] args) {

		HashMap hMap = new HashMap();

		hMap.put(1, "sourabh");
		hMap.put(2, "sodh");
		hMap.put(3, "rabh");
		hMap.put(4, "sorabh");

		for (Object n : hMap.keySet()) {
			System.out.print(n + "=");
			System.out.print(hMap.get(n));
			System.out.println();
		}

		HashMap hMap2 = new HashMap();

		hMap2.put("sourabh", 1);
		hMap2.put("sodh", 2);
		hMap2.put("rabh", 3);
		hMap2.put("sorabh", 4);

		System.out.println("-----map2---------");
		for (Object n : hMap2.keySet()) {
			System.out.print(n + "=");
			System.out.print(hMap2.get(n));
			System.out.println();
		}

	}

}
