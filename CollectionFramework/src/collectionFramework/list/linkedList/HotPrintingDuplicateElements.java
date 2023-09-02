package collectionFramework.list.linkedList;

import java.util.LinkedList;

class Book {

	private int id;
	private String name;
	private int price;

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

	Book(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public String toString() {

		return "\n id" + id + " name" + name + " price" + price;
	}

}

public class HotPrintingDuplicateElements {

	public static void main(String[] args) {

		LinkedList<Book> list = new LinkedList<Book>();

		list.add(new Book(101, "theory of relativity", 15000));
		list.add(new Book(102, "theory of gravity", 20000));
		list.add(new Book(104, "universal laws", 15000));
		list.add(new Book(105, "thrmodymic laws", 15000));
		list.add(new Book(106, "a brief history of human", 20000));
		list.add(new Book(102, "theory of gravity", 20000));
		list.add(new Book(104, "universal laws", 15000));

		int count;

		// printing books having same price
		System.out.println("Books having same price :");
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			count = 1;

			for (int j = 0; j < list.size(); j++) {

				if (list.get(i).getPrice() == list.get(j).getPrice()) {

					count++;

				}
			}
			if (count > 1) {
				System.out.print(list.get(i).getName() + " :");
				System.out.println(list.get(i).getPrice());
			}

		}

	}

}
