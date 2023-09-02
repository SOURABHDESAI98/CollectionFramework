package mapInterface.treeMap.labAssignments;

import java.util.SortedMap;
import java.util.TreeMap;

public class A11 {

	/*
	 * 2.WAP to create a Treemap which contains Strings
	 * 
	 */

	public static void main(String[] args) {

		SortedMap<String, String> tmap = new TreeMap<String, String>();
		tmap.put("sd", "fdg");
		tmap.put("gs", "ajh");
		tmap.put("usa", "ugsa");
		tmap.put("gsa", "ahsag");

		System.out.println(tmap);

	}

}
