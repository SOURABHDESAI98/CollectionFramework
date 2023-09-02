package collectionFramework.list.linkedList.labAssignments;

import java.util.LinkedList;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		LinkedList<Employee> list = new LinkedList<Employee>();

		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		while (flag) {

			System.out.println("1. Enter details \n2. exit");
			System.out.println("Choose option :");
			boolean flag2 = true;
			int choice = sc.nextInt();
			if (choice == 1) {

				System.out.println("Enter id of employee");
				int id = sc.nextInt();
				System.out.println("Enter name of employee");
				String name = sc.next();
				System.out.println("Enter salary of employee");
				int salary = sc.nextInt();

				if (list.size() == 0) {
					list.add(new Employee(id, name, salary));
				} else {

					for (int i = 0; i < list.size(); i++) {

						if (id < list.get(i).getId()) {
							list.addFirst(new Employee(id, name, salary));
							flag2 = false;
							break;
						}

					}
					if (flag2) {
						list.add(new Employee(id, name, salary));
					}
				}

			} else {
				sc.close();
				flag = false;
			}
		}

		for (Employee s : list) {
			System.out.println(s);
		}

	}

}
