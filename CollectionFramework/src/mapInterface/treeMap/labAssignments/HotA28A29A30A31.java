package mapInterface.treeMap.labAssignments;

import java.util.TreeMap;

public class HotA28A29A30A31 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(4, "sourabh");
		tmap.put(11, "suman");
		tmap.put(1, "suman");
		tmap.put(24, "simi");
		tmap.put(3, "suraj");
		tmap.put(2, "simi");
		tmap.put(35, "suraj");
		tmap.put(27, "suraj");
		tmap.put(25, "suraj");

		System.out.println(tmap.subMap(11, 35));

		System.out.println(tmap.subMap(11, false, 35, true) + " excluding 11 & including 35");

		System.out.println(tmap.subMap(1, true, 24, false) + " including 1 & excluding 35");

		System.out.println(tmap.subMap(24, false, 35, true) + " excluding 24 & including 35");

		System.out.println(tmap.subMap(24, true, 35, true) + " including 24 & including 35");

	}
}
