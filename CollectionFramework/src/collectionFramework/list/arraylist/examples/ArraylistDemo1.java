package collectionFramework.list.arraylist.examples;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistDemo1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Provide input :");
			list.add(sc.next());
		}
		sc.close();

		for (String n : list) {

			System.out.print(n.toUpperCase() + " ");
		}

	}

}
