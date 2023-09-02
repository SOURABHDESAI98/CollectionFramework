package collectionFramework.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {

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
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}

public class UserDefinedClassWithArraylist {

	public static void fetchStudentsOnId(List<Student> list) {

		// checking students on their id

		System.out.println("students having id greater than 103 :");
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			if (stu.getId() > 103) {
				System.out.println(stu);
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(101, "hbxv", 78));
		list.add(new Student(102, "bjbkvs", 88));
		list.add(new Student(103, "kavita", 71));
		list.add(new Student(104, "tony shark", 71));
		list.add(new Student(105, "kaptan amrica", 71));
		list.add(new Student(106, "thor", 71));

		System.out.println(list);

		// display arraylist using for loop
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}

		// display arraylist using for each loop

		for (Student s : list) {
			System.out.println(" id:" + s.getId() + " name:" + s.getName() + " marks:" + s.getMarks());
		}

		// using Iterator interface

		Iterator<Student> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getName());
		}

		fetchStudentsOnId(list);

		/*
		 * // checking a particular student
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println("Provide name :");
		 * String name = sc.next(); sc.close();
		 * 
		 * boolean flag = false; for (int i = 0; i < list.size(); i++) { Student stu =
		 * list.get(i); if (stu.getName().equals(name)) { System.out.println(name +
		 * "is present in list"); flag = true; break; } } if (!flag) {
		 * System.out.println(name + "is not present in list"); }
		 * 
		 */

	}

}
