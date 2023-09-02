package mapInterface.treeMap.labAssignments;

import java.util.TreeMap;

public class A21A22 {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(4, "sourabh");
		tmap.put(11, "suman");
		tmap.put(1, "suman");
		tmap.put(24, "simi");
		tmap.put(3, "suraj");
		tmap.put(2, "simi");
		tmap.put(35, "suraj");

		System.out.println("---for entries---");
		System.out.println(tmap.floorEntry(25));
		System.out.println(tmap.ceilingEntry(3));
		System.out.println(tmap.lowerEntry(25));
		System.out.println(tmap.higherEntry(3));

		System.out.println("---for keys---");
		System.out.println(tmap.floorKey(25));
		System.out.println(tmap.ceilingKey(3));
		System.out.println(tmap.lowerKey(25));
		System.out.println(tmap.higherKey(3));

	}

}
