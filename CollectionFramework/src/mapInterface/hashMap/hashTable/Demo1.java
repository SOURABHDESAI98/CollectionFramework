package mapInterface.hashMap.hashTable;

import java.util.Hashtable;

public class Demo1 {

	/*
	 * 1. hashTable does not accept null value as a key or value;
	 * 
	 * 2. hashMap is non synchronised while hashTable is synchronised
	 * 
	 * 3. hashTable is a legacy class
	 * 
	 * 4. hashTable has initial capacity as 11 buckets, and it's load factor is 0.75
	 * 
	 * 4. rest of the things are same as hashMap
	 * 
	 * 5. hashTable does not follow insertion order
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Hashtable<Integer, String> htable = new Hashtable<Integer, String>();

		htable.put(101, "sourabh");
		htable.put(102, "subodh");
		htable.put(107, "suraj");
		htable.put(108, "sukesh");
		htable.put(109, "thukesh");

		System.out.println(htable);

	}

}
