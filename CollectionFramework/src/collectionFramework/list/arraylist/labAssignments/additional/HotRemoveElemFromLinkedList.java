package collectionFramework.list.arraylist.labAssignments.additional;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class HotRemoveElemFromLinkedList {

	public static void main(String[] args) {

		List<String> days = new CopyOnWriteArrayList<String>(); // to avoid ConcurrentModificationException
		days.add("monday");
		days.add("tuesday");
		days.add("wednesday");
		days.add("thursday");
		days.add("friday");
		days.add("saturday");
		days.add("sunday");

		// 1st way
		for (String s : days) {

			if (s.length() > 7) {
				days.remove(s);
			}
		}

		System.out.println(days);

		List<String> days1 = new CopyOnWriteArrayList<String>();
		days1.add("monday");
		days1.add("tuesday");
		days1.add("wednesday");
		days1.add("thursday");
		days1.add("friday");
		days1.add("saturday");
		days1.add("sunday");

		// another way
		for (int i = 0; i < days1.size(); i++) {

			if (days1.get(i).length() > 7) {
				days1.remove(days1.get(i));
				i--;
// index is decremented because when element is removed,the element right next to removed element comes at the place of removed element
			}
		}

		System.out.println(days1);

	}

}
