package collectionFramework.list.linkedList.labAssignments;

import java.util.LinkedList;
import java.util.ListIterator;

class Product {

	private int id;
	private String name;
	private int price;

	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nProduct [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class Example7 {

	public static void main(String[] args) {

		LinkedList<Product> list = new LinkedList<Product>();
		list.add(new Product(101, "mobile", 10000));
		list.add(new Product(102, "laptop", 5000));
		list.add(new Product(103, "air conditioner", 15000));
		list.add(new Product(104, "refrigrator", 18000));

		ListIterator<Product> lit = list.listIterator();

		while (lit.hasNext()) {

			System.out.println(lit.next());
		}

	}

}
