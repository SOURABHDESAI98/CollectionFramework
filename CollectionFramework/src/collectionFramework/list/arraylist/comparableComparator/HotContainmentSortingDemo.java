package collectionFramework.list.arraylist.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Department {
	int did;
	String dname;

	public Department(int did, String dname) {

		this.did = did;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + "]";
	}

}

class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;
	private Department dept;

	public Employee(int id, String name, int salary, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "\nEmployee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}

	// To sort by salary if employee name is same, and if employee name is not same
	// then sort by name
	public int compareTo(Employee e) {

		if (this.name.equals(e.name)) {
			return this.salary - e.salary;

		} else {
			return this.name.compareTo(e.name);
		}

	}

}

class SortSameNameBySalary implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.getSalary() - e2.getSalary();
	}
}

//to sort by department id
class SortByDeptId implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.getDept().did - e2.getDept().did;
	}
}

//to sort by department name
class SortByDeptName implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.getDept().dname.compareTo(e2.getDept().dname);
	}
}

public class HotContainmentSortingDemo {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();

		Department d1 = new Department(201, "IT");
		Department d2 = new Department(202, "MECH");
		Department d3 = new Department(203, "PRODUCTION");
		Department d4 = new Department(204, "SALES");
		Department d5 = new Department(205, "MARKET");
		Department d6 = new Department(206, "DEVELOPER");

		list.add(new Employee(101, "sourabh", 22000, d3));
		list.add(new Employee(102, "kaptan amrica", 34000, d2));
		list.add(new Employee(103, "spanderman", 42000, d1));
		list.add(new Employee(104, "dolan trump", 34000, d4));
		list.add(new Employee(105, "sourabh", 52000, d5));
		list.add(new Employee(106, "sourabh", 12000, d6));

		System.out.println("-----sorting by salary if employee name is same-----");
		Collections.sort(list);
		System.out.println(list);
		System.out.println();

		System.out.println("-----sorting by department id------");
		Collections.sort(list, new SortByDeptId());
		System.out.println(list);
		System.out.println();
		System.out.println("-----sorting by department id------");
		Collections.sort(list, new SortByDeptName());
		System.out.println(list);

	}

}
