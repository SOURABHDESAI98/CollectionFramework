package collectionFramework.set.hashSet.labAssignments;

import java.util.HashSet;
import java.util.Objects;

class Employee {

	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {

		return "\n id :" + id + " name :" + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {

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
		if (this.id == emp.id && this.name.equals(emp.name)) {
			return true;
		}

		return false;
	}
}

public class HotEqualsHashCodeMethodsA10A11A12 {

	public static void main(String[] args) {

		HashSet<Employee> hset = new HashSet<Employee>();
		hset.add(new Employee(8, "sourabh"));
		hset.add(new Employee(21, "sunil"));
		hset.add(new Employee(3, "suraj"));
		hset.add(new Employee(3, "suraj"));
		hset.add(new Employee(9, "subodh"));
		hset.add(new Employee(8, "sourabh"));
		hset.add(new Employee(21, "sunil"));

		System.out.println(hset);

	}

}
