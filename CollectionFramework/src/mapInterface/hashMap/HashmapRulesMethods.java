package mapInterface.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashmapRulesMethods {

	/*
	 * 1. it does not follow insertion order
	 * 
	 * 2. if we provide duplicate keys then it overwrites values
	 * 
	 * 3. if you provide null key then it will be stored at first and only one null
	 * is allowed for key but multiple null can be stored as values
	 * 
	 * 4.keys can not be duplicate but values can be duplicate
	 * 
	 * 5. constructors of hashMap-
	 * 
	 * a. default(parameter less)
	 * 
	 * b. with float load factor as a parameter
	 * 
	 * c. with collection as a parameter
	 * 
	 * 6. you can also add collection as a key or value in hashMap
	 * 
	 * 7. underlined data structure for hashmap is hashtable
	 * 
	 * 8. underline data structure=>
	 * 
	 * ------------hash value=>key=>value=>hash code of next node-----------
	 * 
	 * eg- <Integer,List<>>, <String,ArrayList<String>>,
	 * <CustomClass,Set<>>,<Integer,LinkedList<Integer>>
	 * 
	 */

	public static void main(String[] args) {

		// Map<Integer, String> map=new HashMap<Integer, String>();

		// or

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		// put method is used instead of map
		hashMap.put(101, "sourabh");
		hashMap.put(102, "subodh");
		hashMap.put(107, "suraj");
		hashMap.put(null, "navin");// null key is moved to 0th index

		hashMap.put(102, "sourabh");// overwrites value of key 102, duplicate key can't be present
		hashMap.put(105, "suraj");// duplicate values can be stored
		hashMap.put(null, "chaitnya"); // overwrites value of null key, duplicate null key can't be present
		hashMap.put(109, null);// multiple null values can be stored
		hashMap.put(110, null);
		hashMap.put(107, "suman");
		hashMap.put(108, "keshav");

		System.out.println(hashMap);

//return type of put()-
		System.out.println(hashMap.put(101, "sourabh"));// returns null
		System.out.println(hashMap.put(101, "desai"));// returns sourabh

//1.size()- it returns no. of key-value pairs (no. of entries)
		System.out.println(hashMap.size());

//2.containsKey()-returns boolean

//3.containsValue()-returns boolean

//4.get(key)- it returns value

		hashMap.get(101);

//5.remove(key)-it returns value associated to given key or returns null

		System.out.println(hashMap.remove(101));
		System.out.println(hashMap.remove(101));

//6. remove(key,value)- it returns boolean
		System.out.println(hashMap.remove(107, "suraj"));

//7.entrySet()- it returns set of entries

		System.out.println(hashMap.entrySet() + " :entry set");

//8.keySet()-it returns set of keys

		Set<Integer> kset = hashMap.keySet();

//9.values()- it returns collection of values

		Collection<String> col = hashMap.values();
		System.out.println(col);

//10. replace(key,newValue)- returns value
		hashMap.replace(108, "kiran");

//11. replace(key,oldValue,newValue)- returns boolean
		hashMap.replace(108, "kiran", "joshi");

//12.putIfAbsent(key,value)- if given key-values is absent then only these key-value pairs will be put

		hashMap.putIfAbsent(110, "marksman");
		System.out.println(hashMap);

	}
}
