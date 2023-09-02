package mapInterface.hashMap.hashMapAssignments;

import java.util.HashMap;

/*
 * WAP add elements to HashMap without using generics, 0th location use String as key and 
   Integer as value, on 1st location use String as key String and Integer as value.
 * 
 * 
 */

public class A2 {

	public static void main(String[] args) {

		HashMap hmap = new HashMap();
		hmap.put("Sourabh", 1);
		hmap.put(2, "Sou");
		hmap.put("rabh", 3);
		hmap.put(4, "oura");

		System.out.println(hmap);

	}

}
