package collectionFramework.set.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RulesAndMethods {
	/*
	 * 1. it is used when we don't want duplicate values
	 * 
	 * 2. it follows internal data structure hashtable because it's default
	 * constructure creates hashmap
	 * 
	 * 3. it does not follow insertion order
	 * 
	 * 4. value of set is key of hashmap so values of set can not be repeated, null
	 * value will be put at 0th index
	 * 
	 * 5.as hashmap can't be accessed by using index so you can't access values of
	 * hashset by using index, and does not has key-values entries so you can't use
	 * hset.get(key) or hset.get(index) because it does not has get() method
	 * 
	 * 6. hashset can be iterated by using for each loop,iterator and by passing it
	 * to arraylist then by using for loop and alist.get(index)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		HashSet<Integer> hset = new HashSet<Integer>();
		hset.add(1); // internally it will be hmap.put(1,present)
		hset.add(5);
		hset.add(null);// null value will be put at 0th index
		hset.add(5);// duplicate values will not be taken
		hset.add(7);
		hset.add(10);

		System.out.println(hset);
//1.by using for each loop		
		System.out.println("----by for each loop-----");
		for (Integer n : hset) {
			System.out.println(n);
		}
//2.by using for iterator
		Iterator<Integer> itr = hset.iterator();

		System.out.println("----by using iterator-----");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//3.by passing hashset to arraylist

		System.out.println("-----by using arraylist-----");
		ArrayList<Integer> alist = new ArrayList<Integer>(hset);
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}

	}

}
