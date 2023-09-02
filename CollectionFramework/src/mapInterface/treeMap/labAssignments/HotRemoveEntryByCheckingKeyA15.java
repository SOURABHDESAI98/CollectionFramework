package mapInterface.treeMap.labAssignments;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class HotRemoveEntryByCheckingKeyA15 {
	/*
	 * 15.WAP to remove a particular entry by checking key
	 * 
	 */
	public static void main(String[] args) {

		SortedMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(4, "sourabh");
		tmap.put(1, "neha");
		tmap.put(3, "suraj");
		tmap.put(2, "subodh");

//1st way
		tmap.remove(2);

		System.out.println(tmap);

//2nd way
		Iterator<Integer> itr = tmap.keySet().iterator();
		while (itr.hasNext()) {

			if (itr.next() == 2) {
				itr.remove();
			}

		}
		System.out.println(tmap);
	}

}
