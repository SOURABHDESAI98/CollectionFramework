package collectionFramework.list.arraylist.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;

// By using Comparable Interface
class Student implements Comparable<Student> {

	/*
	 * 1. you can not directly use Collections.sort() method for arraylist of
	 * objects
	 * 
	 * 2. for that your Parent class of objects should implement
	 * Comparable<ClassName c> interface and it should give body to compareTo(
	 * ClassName b) abstract method of Comparable interface
	 * 
	 * 3. Comparator and Comparable are interfaces
	 * 
	 * 
	 */

	private int id;
	private String name;
	private int marks;

	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	// body is given to CompareTo(ClassName c) abstract method of Comparable
	// Interface
	@Override
	// this method will return either positive value or negative value or zero
	public int compareTo(Student o) {

// for Id;
		if (this.id == o.id) {
			return 0;
		} else if (this.id > o.id) {
			return 1;
		} else {
			return -1;
		}

		// return this.name.compareTo(o.name); (For name)

	}

}

public class HotUsingCollectionsSortMethodForArraylistOfObjects {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(102, "bjbkvs", 88));
		list.add(new Student(104, "tony shark", 71));
		list.add(new Student(101, "hbxv", 78));
		list.add(new Student(105, "kaptan amrica", 71));
		list.add(new Student(106, "thor", 71));
		list.add(new Student(103, "kavita", 71));

		System.out.println("--------Before Sorting--------");
		System.out.println(list);
		Collections.sort(list);
		System.out.print("--------After Sorting--------");
		System.out.println(list);

	}

}
