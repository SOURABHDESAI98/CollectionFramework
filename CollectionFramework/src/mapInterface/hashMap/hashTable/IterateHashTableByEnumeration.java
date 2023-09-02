package mapInterface.hashMap.hashTable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class IterateHashTableByEnumeration {

	/*
	 * 1. Enumeration iterator is used for legacy classes, hashTable is a legacy
	 * class
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();

		htable.put(101, "sourabh");
		htable.put(102, "subodh");
		htable.put(107, "suraj");
		htable.put(108, "sukesh");
		htable.put(109, "mahesh");

		System.out.println("-----enumeration by using keys-------");
		Enumeration<Integer> en = htable.keys();// just like keySet() method

		while (en.hasMoreElements()) {
			Integer key = en.nextElement();
			System.out.print(key + ":");
			System.out.print(htable.get(key));
			System.out.println();

		}

		System.out.println("-----enumeration by using values------");
		Enumeration<String> en1 = htable.elements(); // it returns values

		while (en1.hasMoreElements()) {
			String str = en1.nextElement();
			System.out.println(str);

		}

		while (en1.hasMoreElements()) {
			String str = en1.nextElement();
			System.out.println(str);

		}

		// iterating entries of hash table-
		System.out.println("----fetching hashtable entries by using iterator interface----");
		Iterator<Map.Entry<Integer, String>> itr = htable.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.print(entry.getKey() + "=");
			System.out.print(entry.getValue() + " ");
			System.out.println();
		}

	}

}
