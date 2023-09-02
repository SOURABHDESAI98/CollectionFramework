package mapInterface.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HotArrayListToHashMap {

// convert arrayList of students into HashMap having keys as names and values as their frequency(occurrence)	

	public static void main(String[] args) {

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("navin");
		aList.add("keshav");
		aList.add("sharda");
		aList.add("rushikesh");
		aList.add("swati");
		aList.add("shivani");
		aList.add("suraj");
		aList.add("rushikesh");
		aList.add("prasad");
		aList.add("suraj");
		aList.add("rushikesh");

		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		int count;
		for (String n : aList) {

			if (hmap.containsKey(n)) {

				count = hmap.get(n) + 1;
				hmap.put(n, count);

			} else {
				count = 1;
				hmap.put(n, count);
			}
		}

		for (Map.Entry<String, Integer> e : hmap.entrySet()) {

			System.out.print(e.getKey() + "=");
			System.out.print(e.getValue());
			System.out.println();
		}

	}

}
