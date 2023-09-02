package mapInterface.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapMethods {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lMap = new LinkedHashMap<Integer, String>();

		lMap.put(1, "sourabh");
		lMap.put(2, "suraj");
		lMap.put(3, "subodh");
		lMap.put(4, "suresh");
		lMap.put(5, "sukesh");

		lMap.putIfAbsent(6, "suman");

		System.out.println(lMap.containsKey(4));

		System.out.println(lMap.containsValue("sourabh"));

		Set<Integer> keys = lMap.keySet();

		Set<Map.Entry<Integer, String>> entries = lMap.entrySet();

//forEach()

//compute()   

	}

}
