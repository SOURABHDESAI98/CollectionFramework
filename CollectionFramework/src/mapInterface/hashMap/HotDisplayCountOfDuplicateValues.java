package mapInterface.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Student {

	private int id;
	private String name;
	private double marks;

	public Student(int id, String name, double marks) {
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

}

public class HotDisplayCountOfDuplicateValues {

	public static void main(String[] args) {

		// storing Student object and it's respective course
		HashMap<Student, String> oldMap = new HashMap<Student, String>();
		oldMap.put(new Student(101, "sourabh", 98), "js");
		oldMap.put(new Student(102, "suraj", 91), "html");
		oldMap.put(new Student(103, "subodh", 90), "js");
		oldMap.put(new Student(101, "sourabh", 98), "css");
		oldMap.put(new Student(102, "suraj", 91), "html");
		oldMap.put(new Student(103, "subodh", 90), "css");

		Set<Map.Entry<Student, String>> set = oldMap.entrySet();

		for (Map.Entry<Student, String> s : set) {

			System.out.print(s.getKey() + " Course: " + s.getValue());
		}

		// storing course and it's count in new map
		HashMap<String, Integer> newMap = new HashMap<String, Integer>();

		int count;
		for (Map.Entry<Student, String> e : oldMap.entrySet()) {

			if (newMap.containsKey(e.getValue())) {
				count = newMap.get(e.getValue()) + 1;
				newMap.put(e.getValue(), count);

			} else {
				count = 1;
				newMap.put(e.getValue(), count);
			}
		}

		System.out.println("------------------------------------------");

		for (Map.Entry<String, Integer> n : newMap.entrySet()) {
			System.out.println(n);
		}

	}

}
