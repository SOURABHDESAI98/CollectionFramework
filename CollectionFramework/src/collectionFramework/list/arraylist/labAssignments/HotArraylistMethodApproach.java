package collectionFramework.list.arraylist.labAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HotArraylistMethodApproach {

	static ArrayList<String> list = new ArrayList<String>();

	static Scanner sc = new Scanner(System.in);

	public static void addObjectToList() {
		int i = 0;
		while (i < 5) {
			System.out.println("Provide string input :");
			list.add(sc.next());
			i++;
		}

	}

	public static String getObjectFromList() {
		String a;
		System.out.println("Provide index of object to get it :");
		a = list.get(sc.nextInt());
		return a;

	}

	public static void displayAllObjects() {

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

	public static void removeObjectUsingIndex() {
		String a = "";
		System.out.println("Provide index of object to remove it :");

		try {
			a = list.remove(sc.nextInt());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(list + " (" + a + " is removed)");

	}

	public static void removeObjectUsingName() {

		System.out.println("Provide name of object to remove it :");

		String a = sc.next();
		list.remove(a);

		System.out.println(list + " (" + a + " is removed)");

	}

	public static void updateObjectFromList() {

		System.out.println("Provide index of object to update it :");
		int a = sc.nextInt();
		System.out.println("Provide string value to update it :");
		String b = sc.next();

		list.set(a, b);
		System.out.println(list + " list is updated");

	}

	public static void main(String[] args) {

		boolean flag = true;

		do {
			System.out.println();
			System.out.println(
					"1.add object to array \n2.get object \n3.display all \n4.remove using index \n5.remove using object \n6.update object \n7.exit");
			System.out.println("Choose a option ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				addObjectToList();
				break;
			case 2:
				System.out.println(getObjectFromList());

				break;
			case 3:
				displayAllObjects();
				break;
			case 4:
				removeObjectUsingIndex();
				break;
			case 5:
				removeObjectUsingName();
				break;
			case 6:
				updateObjectFromList();
				break;
			case 7:
				System.exit(0);
				break;
			}

		} while (flag);

	}

}
