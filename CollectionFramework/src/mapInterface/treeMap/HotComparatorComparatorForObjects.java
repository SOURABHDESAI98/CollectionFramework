package mapInterface.treeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/*
      1. sorted map implicitly uses comparator interface for sorting data, sorted
	  map is implemented by tree map, but for sorting objects of class we need to
	  implement comparator or comparable interface explicitly
	  
	  2 Collections.sort() method is not used to sort treemap because it sorts
	 automatically 
	 
	 3. Collections.sort() method does not take map data structure as a parameter
	   it only takes list as a parameter
	  
	  
	  4 for comparator pass object of class (who implements comparator) in
	  constructor of treemap
	  
	  eg- TreeMap<Integer, String> tmap= new TreeMap<Integer,String>(new
	  ClassName());
	  
	  
	  5.if you want to sort keys of HashMap/LinkedHasMap then you need to pass it
	  as a parameter to constructor of SortedMap/NavigableMap/TreeMap to sort it
	  ascendingly by default
	  
 */

class Student implements Comparable<Student> { // sorting by id

	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {

		return " id " + id + " name " + name;
	}

	public int compareTo(Student s1) {
		return this.id - s1.id;
	}

}

// sorting by name
class SortingByName implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}

}

public class HotComparatorComparatorForObjects {

	public static void main(String[] args) {

// by using comparable interface		
		TreeMap<Student, String> tmap = new TreeMap<Student, String>();
		tmap.put(new Student(105, "sourabh"), "html");
		tmap.put(new Student(102, "suraj"), "css");
		tmap.put(new Student(107, "suman"), "js");
		tmap.put(new Student(103, "sunil"), "jquery");
		tmap.put(new Student(109, "surul"), "html");

		System.out.println("---Ascending Sorting by implementing comparable interface----");
		for (Map.Entry<Student, String> e : tmap.entrySet()) {
			System.out.print(e.getKey() + " ");
			System.out.print(e.getValue() + " ");
			System.out.println();
		}

		NavigableMap<Student, String> nmap = tmap.descendingMap();

		System.out.println("---Descending Sorting by implementing comparable interface----");
		for (Map.Entry<Student, String> e : nmap.entrySet()) {
			System.out.print(e.getKey() + " ");
			System.out.print(e.getValue() + " ");
			System.out.println();
		}

// for comparator pass object of class (who implements comparator) in constructor of treemap
		TreeMap<Student, String> tmap2 = new TreeMap<Student, String>(new SortingByName());

		tmap2.put(new Student(105, "sourabh"), "html");
		tmap2.put(new Student(102, "suraj"), "css");
		tmap2.put(new Student(107, "suman"), "js");
		tmap2.put(new Student(103, "sunil"), "jquery");
		tmap2.put(new Student(109, "surul"), "html");

		System.out.println("---Ascending Sorting by implementing comparator interface----");
		for (Map.Entry<Student, String> e : tmap2.entrySet()) {
			System.out.print(e.getKey() + " ");
			System.out.print(e.getValue() + " ");
			System.out.println();
		}

		NavigableMap<Student, String> nmap2 = tmap2.descendingMap();

		System.out.println("---Descending Sorting by implementing comparator interface----");
		for (Map.Entry<Student, String> e : nmap2.entrySet()) {
			System.out.print(e.getKey() + " ");
			System.out.print(e.getValue() + " ");
			System.out.println();
		}

	}

}
