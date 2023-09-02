package HotExample;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {

	public static void findHighestSalaryInEachDepartment(HashMap<Employee, Department> hmap) {

		HashSet<Department> hSet = new HashSet<Department>();

		for (Employee e : hmap.keySet()) {

			hSet.add(hmap.get(e));
		}
	}

	public static void main(String[] args) {

		HashMap<Employee, Department> hmap = new HashMap<Employee, Department>();

		hmap.put(new Employee(101, "sourabh", 1000000), new Department(1, "IT"));
		hmap.put(new Employee(102, "suraj", 10000), new Department(2, "Mech"));
		hmap.put(new Employee(103, "mukesh", 20000), new Department(3, "ENTC"));
		hmap.put(new Employee(104, "mina", 400000), new Department(1, "IT"));
		hmap.put(new Employee(105, "sujay", 50000), new Department(4, "Chemical"));
		hmap.put(new Employee(106, "shiv", 800000), new Department(2, "Mech"));
		hmap.put(new Employee(107, "nina", 90000), new Department(1, "IT"));

		findHighestSalaryInEachDepartment(hmap);

	}

}
