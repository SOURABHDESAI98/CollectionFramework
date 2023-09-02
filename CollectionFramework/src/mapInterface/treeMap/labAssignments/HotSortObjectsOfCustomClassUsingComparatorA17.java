package mapInterface.treeMap.labAssignments;

import java.util.Comparator;
import java.util.TreeMap;

class Student {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "\n id" + id + " name" + name;
	}
}

class SortById implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		return s1.id - s2.id;
	}
}

public class HotSortObjectsOfCustomClassUsingComparatorA17 {

	/*
	 * 17. WAP to sort keys in TreeMap by using comparator.
	 * 
	 */

	public static void main(String[] args) {

		TreeMap<Student, String> tmap = new TreeMap<Student, String>(new SortById());

		tmap.put(new Student(101, "sourabh"), "fsd");
		tmap.put(new Student(104, "sojoy"), "html");
		tmap.put(new Student(106, "suraj"), "js");
		tmap.put(new Student(102, "subodh"), "java");

		System.out.println(tmap);

	}

}
