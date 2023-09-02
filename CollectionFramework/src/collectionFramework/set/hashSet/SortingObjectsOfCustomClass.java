package collectionFramework.set.hashSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class Customer implements Comparable<Customer> {

	int id;
	String name;

	Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {

		return " id:" + id + " name:" + name;
	}

	public int compareTo(Customer c) {
		return this.id - c.id;
	}

}

class SortByName implements Comparator<Customer> {

	public int compare(Customer c1, Customer c2) {
		return c1.name.compareTo(c2.name);
	}
}

public class SortingObjectsOfCustomClass {

	public static void main(String[] args) {

		HashSet<Customer> hset = new HashSet<Customer>();

		hset.add(new Customer(107, "sima"));
		hset.add(new Customer(109, "tina"));
		hset.add(new Customer(101, "sourabh"));
		hset.add(new Customer(103, "suman"));
		hset.add(new Customer(102, "suraj"));
		hset.add(new Customer(104, "sujay"));

		TreeSet<Customer> tSet = new TreeSet<Customer>(hset);

		System.out.println("-----Sorting By ID------");
		for (Customer c : tSet) {
			System.out.println(c);
		}

// by implementing comparator interface	

		TreeSet<Customer> tSet2 = new TreeSet<Customer>(new SortByName());
		tSet2.add(new Customer(107, "sima"));
		tSet2.add(new Customer(109, "tina"));
		tSet2.add(new Customer(101, "sourabh"));
		tSet2.add(new Customer(103, "suman"));
		tSet2.add(new Customer(102, "suraj"));
		tSet2.add(new Customer(104, "sujay"));

		System.out.println("-----Sorting By Name-----");
		for (Customer c : tSet2) {
			System.out.println(c);
		}

	}

}
