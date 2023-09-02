package mapInterface.treeMap.labAssignments;

import java.util.SortedMap;
import java.util.TreeMap;

public class HotA23A24 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(4, "sourabh");
		tmap.put(11, "suman");
		tmap.put(1, "suman");
		tmap.put(24, "simi");
		tmap.put(3, "suraj");
		tmap.put(2, "simi");
		tmap.put(35, "suraj");

		SortedMap<Integer, String> smap = tmap.headMap(24, true);
		System.out.println(smap + "entry having key 24 is included");

		smap = tmap.tailMap(24, false);
		System.out.println(smap + "entry having key 24 is excluded");

	}
}
