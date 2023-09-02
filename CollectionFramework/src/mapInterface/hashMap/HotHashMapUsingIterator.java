package mapInterface.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HotHashMapUsingIterator {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(101, "sourabh");
		hmap.put(102, "subodh");
		hmap.put(107, "suraj");
		hmap.put(108, "sukesh");
		hmap.put(109, "thukesh");

		Iterator<Map.Entry<Integer, String>> itr = hmap.entrySet().iterator();// same can be done by using keySet() and
																				// values()
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.print(entry.getKey() + "=");
			System.out.print(entry.getValue() + " ");
			System.out.println();
		}
	}

}
