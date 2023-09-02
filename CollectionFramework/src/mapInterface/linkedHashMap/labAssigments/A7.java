package mapInterface.linkedHashMap.labAssigments;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class A7 {

	/*
	 * 8.WAP to copy a HashMap content to another LinkedHashMap.
	 * 
	 */

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(4, "sourabh");
		hmap.put(5, "suraj");
		hmap.put(8, "sumit");
		hmap.put(2, "simi");

		LinkedHashMap<Integer, String> lMap = new LinkedHashMap<Integer, String>(hmap);
		System.out.println(lMap);

	}

}
