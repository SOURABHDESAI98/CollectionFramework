package mapInterface.treeMap.labAssignments;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class HotA19 {
	/*
	 * 20. WAP to get a reverse order view of the keys contained in a given map
	 * TreeMap.
	 * 
	 */

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(4, "sourabh");
		tmap.put(11, "suman");
		tmap.put(1, "suman");
		tmap.put(24, "simi");
		tmap.put(3, "suraj");
		tmap.put(2, "simi");
		tmap.put(35, "suraj");

		NavigableMap<Integer, String> nmap = tmap.descendingMap();

		for (Map.Entry<Integer, String> e : nmap.entrySet()) {
			System.out.println(e);
		}

	}

}
