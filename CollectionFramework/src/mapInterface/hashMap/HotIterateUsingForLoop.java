package mapInterface.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HotIterateUsingForLoop {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		// put method is used instead of map
		hmap.put(101, "sourabh");
		hmap.put(102, "subodh");
		hmap.put(107, "suraj");
		hmap.put(null, "navin");// null key is moved to 0th index
		hmap.put(102, "sourabh");// overwrites value of key 102, duplicate key can't be present
		hmap.put(105, "suraj");// duplicate values can be stored
		hmap.put(null, "chaitnya"); // overwrites value of null key, duplicate null key can't be present
		hmap.put(109, null);// multiple null values can be stored
		hmap.put(110, null);

		// iterating values by using keySet()

		Set<Integer> s1 = hmap.keySet();
		for (Integer key : s1) {
			System.out.println(hmap.get(key));

		}

		// iterating values by using values()

		Collection<String> c = hmap.values();
		for (String value : c) {
			System.out.println(value);
		}

		// iterating entries by using entrySet()

		/*
		 * 1. Entry is inner interface in Map interface which is accessed by Map.Entry
		 * 
		 * 2. getKey() and getValue() are methods in Entry Interface
		 * 
		 * 3. <Map.Entry<Integer, String> is a data type of each entry, so each entry is
		 * a object of inner interface <Map.Entry<Integer, String>
		 * 
		 * eg- <Map.Entry<Integer, String> entry=each entry; just like String a="xyz";
		 *
		 */

		Set<Map.Entry<Integer, String>> s2 = hmap.entrySet();

		for (Map.Entry<Integer, String> entry : s2) {

			System.out.println(entry);
		}

		for (Map.Entry<Integer, String> entry : s2) {

			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
