package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WaysToAvoidConCurrentModificationException {
	// WaysToAvoidConCurrentModificationException

	/*
	 * 1. use CopyOnWriteArrayist<>(); for arraylist
	 * 
	 * 2. decrement index if object positioned at same index is to be removed
	 * 
	 * 3. use itr.next() then itr.remove() methods of Iterator interface
	 * 
	 * 4. you can also use ConcurrentHashMap<k,V> or ConcurrentMap<k,V> or
	 * NavigableMap<k,V>
	 * 
	 */

	public static void main(String[] args) {

		// 3rd way
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Sourabh");
		hmap.put(2, "Sobodh");
		hmap.put(3, "Suraj");
		hmap.put(4, "Sunak");
		hmap.put(5, "sunil");

		Iterator<Map.Entry<Integer, String>> itr = hmap.entrySet().iterator();
		while (itr.hasNext()) {

			itr.next();
			itr.remove(); // this is done to avoid concurrent modification exception

		}

		System.out.println(hmap.isEmpty());

	}

}
