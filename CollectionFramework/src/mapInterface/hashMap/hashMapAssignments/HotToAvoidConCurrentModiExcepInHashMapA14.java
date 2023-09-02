package mapInterface.hashMap.hashMapAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HotToAvoidConCurrentModiExcepInHashMapA14 {
// use next() and remove() methods of iterator to avoid ConcurrentModificationException in HashMap

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Sourabh");
		hmap.put(2, "Sobodh");
		hmap.put(3, "Suraj");
		hmap.put(4, "Sunak");
		hmap.put(5, "sunil");

		// 1st way
		Iterator<Map.Entry<Integer, String>> itr = hmap.entrySet().iterator();

		while (itr.hasNext()) {

			itr.next();
			itr.remove(); // this is done to avoid concurrent modification exception in hashmap

		}

		System.out.println(hmap.isEmpty());
	}
}
