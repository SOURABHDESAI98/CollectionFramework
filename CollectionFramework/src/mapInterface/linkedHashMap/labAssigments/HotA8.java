package mapInterface.linkedHashMap.labAssigments;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HotA8 {

	/*
	 * 8.WAP to delete all elements from a given LinkedHashMap.
	 * 
	 */

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
		lmap.put(4, "sourabh");
		lmap.put(5, "suraj");
		lmap.put(8, "sumit");
		lmap.put(2, "simi");

		Iterator<Map.Entry<Integer, String>> itr = lmap.entrySet().iterator();

		while (itr.hasNext()) {
			itr.next();
			itr.remove();
		}

		System.out.println(lmap.isEmpty());

	}

}
