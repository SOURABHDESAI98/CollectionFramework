package collectionFramework.list.arraylist;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafeIterator {

	// 1.to avoid ConCurrentModificationException

	public static void main(String[] args) {

// if we use this, then iterator will be fast fail iterator
		// ArrayList<String> list = new ArrayList<String>();

// To avoid ConcurrentModificationException use CopyOnArrayList<>(); instead of Arraylist<>();
		List<String> list = new CopyOnWriteArrayList<String>();
		list.add("sd");
		list.add("gh");
		list.add("ls");
		list.add("sd");
		list.add("ns");

		Iterator<String> itr = list.iterator();// this is fast safe iterator because we have used
												// CopyOnWriteArrayList<String>();

		int count = 0;
		while (itr.hasNext()) {
			if (itr.next().equals("sd")) {
				list.add(count, "added");
			}
			count++;
		}

		System.out.println(list);

	}

}
