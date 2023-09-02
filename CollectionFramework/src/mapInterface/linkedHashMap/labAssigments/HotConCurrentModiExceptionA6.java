package mapInterface.linkedHashMap.labAssigments;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * 
 * 
 * 6. WAP to create a LinkedHashMap. Add 3 objects in it. 
             a. WAP to search a value in the Map.
             b. WAP to get all keys in the Map.
             c. WAP to remove an element from the Map.
 * 
 */

public class HotConCurrentModiExceptionA6 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lMap = new LinkedHashMap<Integer, String>();
		lMap.put(1, "sourabh");
		lMap.put(7, "suraj");
		lMap.put(5, "simaran");
		lMap.put(9, "siddhi");
		lMap.put(2, "sumit");

		Iterator<Map.Entry<Integer, String>> itr = lMap.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, String> e = itr.next();
			if (e.getValue() == "sourabh") {
				itr.remove();
			}

		}

		System.out.println(lMap);

	}

}
