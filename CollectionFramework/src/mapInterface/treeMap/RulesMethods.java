package mapInterface.treeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class RulesMethods {

	/*
	 * 1. sorted map implicitly uses comparator interface for sorting data, sorted
	 * map is implemented by tree map, but for sorting objects of class we need to
	 * implement comparator or comparable interface explicitly
	 * 
	 * 1.2 Collections.sort() method is not used to sort sortedMap because it sorts
	 * automatically
	 * 
	 * 1.3 Collections.sort() method does not take map data structure as a parameter
	 * it only takes list as a parameter
	 * 
	 * 1.4 if you want to sort keys of HashMap/LinkedHasMap then you need to pass it
	 * as a parameter to constructor of SortedMap/NavigableMap/TreeMap to sort it
	 * ascendingly by default
	 *
	 * 
	 * 1.5 for comparator pass object of class (who implements comparator) in
	 * constructor of treemap
	 * 
	 * eg- TreeMap<Integer, String> tmap= new TreeMap<Integer,String>(new
	 * HashMap<k,v>());
	 * 
	 * 1.4 Hierarchy=> sortedmap=>navigablemap=>treemap
	 * 
	 * 2. sorting will be done based on key, sorting will be done by ascending order
	 * in default
	 * 
	 * 3. treemap does not accept null key, because null can be compared to other
	 * key and it will give NullPointerException
	 * 
	 * 4. treemap is not synchronised
	 * 
	 * 5. Collections.synchronisedSortedMap(); can be used to make it synchronised
	 * 
	 * 
	 * 6. treeMap/sortedMap doesn't accept duplicate objects of same custom class as
	 * a key unlike hashMap/linkedhashMap so you don't need to override equals() and
	 * hashcode() methods in custom class of those objects in case of
	 * treeMap/sortedMap
	 * 
	 * 
	 */

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(7, "sourabh");
		tmap.put(4, "suraj");
		tmap.put(8, "subodh");
		tmap.put(3, "suresh");
		tmap.put(1, "sukesh");
		tmap.put(10, "thukesh");
		tmap.put(12, "ukesh");

		System.out.println("------ascending order by default-----");
		for (Map.Entry<Integer, String> e : tmap.entrySet()) {
			System.out.print(e.getKey() + " ");
			System.out.print(e.getValue() + " ");
			System.out.println();
		}

// to make descending sorting

		NavigableMap<Integer, String> nmap = tmap.descendingMap();
		/*
		 * # this method returns NavigableMap<> so values can be stored in
		 * NavigableMap<> or SortedMap<> not in TreeMap<>,because you can not stored
		 * parent's objects in child class reference(down casting is not possible)
		 *
		 */

		System.out.println("------descending order-----");
		for (Map.Entry<Integer, String> e : nmap.entrySet()) {
			System.out.print(e.getKey() + " ");
			System.out.print(e.getValue() + " ");
			System.out.println();
		}

//1.firstKey()

//2.lastKey()	

//3.headMap(key)-it returns SortedMap<k,v> having entries whose keys are less than given key excluding entry of given key

		// headMap(key,true)-to include given key
		System.out.println(tmap.headMap(8) + " :headMap(8) (returns SortedMap<k,v>)");

//4.tailMap(key)-it returns SortedMap<k,v> having entries whose keys are less than given key including entry of given key

		// tailMap(key,false)-to exclude given key
		System.out.println(tmap.tailMap(8) + " :tailMap(8) (returns SortedMap<k,v>)");

//5.subMap()-it returns SortedMap<k,v> having all entries whose keys are between given keys including entry of start key and excluding entry of end key

		System.out.println(tmap.subMap(8, 12) + " :subMap(8, 12) (returns SortedMap<k,v>) ");

//6.lowerKey(key)- it returns immediate lower key of given key

//7.higherKey(key)- it returns immediate higher key of given key

//8.ceilimgKey(key)- it returns immediate higher key of given key or same key if given key is present in treemap

//9.floorkey(key)- it returns immediate lower key of given key or same key if given key is present in treemap		

	}
}
