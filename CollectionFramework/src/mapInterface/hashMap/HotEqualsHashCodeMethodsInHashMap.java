package mapInterface.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*
 * 1.if we put multiple objects of same class in hashMap as a key then they are added, they are not overwritten.
 * 2. so to avoid this equals and hasCode must be overridden in that class
 * 3. normally just to compare two objects equals method is overridden but in hashMap equals and hashCode() methods must be overridden
 *
 *4. put() method uses equals method internally only for keys,not for values (because values can be duplicate)
 *
 *5. add() method does not uses equals method internally that's why duplicate objects can be added in list even if equals method is overrided in Class of those objects 
 *
 */

class Employee {

	private int id;
	private String name;

	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	private int salary;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		// objects is a predefined class
		return Objects.hash(id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {// Object obj is passed as an argument because equals method is overrided
										// from Object class

		if (this == obj) { // this indicates current object
			return true;
		}

		if (obj == null) { // if the second object is null but first object is not null then return false
			return false;
		}

		if (this.getClass() != obj.getClass()) { // this is to check whether both objects are of same class
			return false;
		}

		Employee emp = (Employee) obj;

		// you can also try for only name or id or salary
		if (this.id == emp.id && this.name.equals(emp.name) && this.salary == emp.salary) {
			return true;
		}

		return false;
	}
}

public class HotEqualsHashCodeMethodsInHashMap {

	public static void main(String[] args) {

		HashMap<Employee, String> hmap = new HashMap<Employee, String>();

		hmap.put(new Employee(101, "sourabh", 100000), "HR");
		hmap.put(new Employee(102, "suraj", 14000), "Sales");
		hmap.put(new Employee(103, "subodh", 15000), "Production");
		hmap.put(new Employee(104, "sunak", 1000), "It");
		// trying to add duplicate key
		hmap.put(new Employee(101, "sourabh", 100000), "HR");
		hmap.put(new Employee(105, "sanjay", 19387), "Sales");
		hmap.put(new Employee(106, "shirkant", 19000), "Production");
		hmap.put(new Employee(107, "keshav", 893729), "It");

		System.out.println("---hashmap having employee objects and departments-----");
		// duplicate key is not added
		System.out.println(hmap);

		HashMap<String, Integer> hMap2 = new HashMap<String, Integer>();

		int count;
		for (Map.Entry<Employee, String> n : hmap.entrySet()) {

			if (hMap2.containsKey(n.getValue())) {
				count = hMap2.get(n.getValue()) + 1;
				hMap2.put(n.getValue(), count);

			} else {
				count = 1;
				hMap2.put(n.getValue(), count);
			}

		}
		System.out.println();
		System.out.println("----new hashmap having departments and their frequency---");
		System.out.println(hMap2);

	}
}
