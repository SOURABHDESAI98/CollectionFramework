package collectionFramework.set.hashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HotConvertDuplicateListToUniqueList {
	/*
	 * 1. convert duplicate values list to unique values list
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(null);
		alist.add(10);
		alist.add(12);
		alist.add(18);
		alist.add(null);
		alist.add(10);
		alist.add(19);
		alist.add(18);
		alist.add(28);

		HashSet<Integer> hset = new HashSet<Integer>(alist);

		ArrayList<Integer> alist2 = new ArrayList<Integer>(hset);

		for (int i = 0; i < alist2.size(); i++) {
			System.out.println(alist2.get(i));
		}

	}

}
