package collectionFramework.set.linkedHasSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HotHashMapToSet {

	public static void main(String[] args) {

		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(1, "sourabh");
		hMap.put(2, "suraj");
		hMap.put(3, "sanjay");
		hMap.put(4, "suresh");
		hMap.put(5, "sukesh");

		System.out.println("-----hashmap key by using set-----");
		Set<Integer> key = hMap.keySet();

		for (Integer n : key) {
			System.out.println(n);
		}

		System.out.println("------hashmap key and value pair by using set------");

		for (Integer n : key) {
			System.out.println(n + "=" + hMap.get(n));
		}

		Set<Map.Entry<Integer, String>> entries = hMap.entrySet();// or you can also use Entry<Integer, String>

		System.out.println("-----hashmap key and value pair by using entryset------");

		for (Map.Entry<Integer, String> e : hMap.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}
}
