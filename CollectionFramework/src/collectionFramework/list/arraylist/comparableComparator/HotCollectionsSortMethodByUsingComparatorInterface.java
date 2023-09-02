package collectionFramework.list.arraylist.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//By using Comparator Interface, Comparator and Comparable are interfaces

class Food {

	/*
	 * 1. you can not directly use Collections.sort() method for arraylist of
	 * objects
	 * 
	 * 2. for that you need to create another class implementing Comparable
	 * interface.
	 * 
	 * 3.That class should give body to compare(ClassNmae a, ClassNmae a) abstract
	 * method of Comparable interface.
	 * 
	 * 4. pass object of that class while calling sort method of Collections class
	 * eg- Collections.sort(list,new FoodSortById());
	 * 
	 * 
	 * 
	 */

	private int id;
	private String name;
	private int price;

	public Food(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "\nFood [id=" + id + ", name=" + name + ", price=" + price + "]";
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

}

class FoodSortById implements Comparator<Food> {

	@Override
	// this method will return either positive value or negative value or zero
	public int compare(Food o1, Food o2) {

		return o1.getId() - o2.getId();
	}

}

class FoodSortByName implements Comparator<Food> {

	public int compare(Food o1, Food o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class HotCollectionsSortMethodByUsingComparatorInterface {
	public static void main(String[] args) {

		ArrayList<Food> list = new ArrayList<Food>();
		list.add(new Food(101, "vadapav", 20));
		list.add(new Food(102, "misalpav", 50));
		list.add(new Food(103, "shevpav", 15));
		list.add(new Food(104, "maskapav", 10));

		System.out.println("------Sorting by ID--------");
		Collections.sort(list, new FoodSortById());
		System.out.println(list);
		System.out.println("------Sorting by Name--------");
		Collections.sort(list, new FoodSortByName());
		System.out.println(list);

	}

}
