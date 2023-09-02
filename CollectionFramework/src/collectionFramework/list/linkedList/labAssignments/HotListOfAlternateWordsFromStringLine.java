package collectionFramework.list.linkedList.labAssignments;

import java.util.LinkedList;
import java.util.Scanner;

public class HotListOfAlternateWordsFromStringLine {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);
		int count = 0;

		while (count < 4) {
			System.out.println("Provide a sentence :");
			String input = sc.nextLine();

			String a[] = input.split(" ");

			if (a.length > 3) {

				list.add(input);
			}
			count++;
		}

//printing list whose each element has more than tree words
		System.out.println("----------list1------------");
		for (String s : list) {
			System.out.println(s);
		}

// creating list containing alternate words of each string line of list1
		LinkedList<String> list1 = new LinkedList<String>();

		String a[];
		String str;

		for (String s : list) {
			str = "";
			a = s.split(" ");

			for (int i = 0; i < a.length; i++) {
				if (i % 2 == 0) {
					str += a[i] + " ";
				}
			}
			list1.add(str);
		}

		System.out.println("----------list2------------");
		for (String s : list1) {
			System.out.println(s);
		}

	}

}
