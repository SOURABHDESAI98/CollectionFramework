package collectionFramework.list.linkedList.labAssignments;

import java.util.LinkedList;

class SuperHeros {

	private int id;
	private String name;
	private String superPower;

	SuperHeros(int id, String name, String superPower) {
		this.id = id;
		this.name = name;
		this.superPower = superPower;

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

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public boolean equals(SuperHeros s) {
		return this.id == s.id && this.name.equals(s.name) && this.superPower.equals(s.superPower);
	}

	@Override
	public String toString() {
		return "\nSuperHeros [id=" + id + ", name=" + name + " superpower=" + superPower + "]";
	}

}

public class HotFindDuplicateObjectInList {

	public static void main(String[] args) {

		LinkedList<SuperHeros> sups = new LinkedList<SuperHeros>();
		sups.add(new SuperHeros(101, "shaktiman", "automatic healing"));
		sups.add(new SuperHeros(102, "thanos", "infinity stones"));
		sups.add(new SuperHeros(101, "shaktiman", "automatic healing"));
		sups.add(new SuperHeros(103, "john wick", "name is enough"));
		sups.add(new SuperHeros(101, "shaktiman", "automatic healing"));
		sups.add(new SuperHeros(103, "john wick", "name is enough"));
		sups.add(new SuperHeros(102, "thanos", "infinity stones"));
		sups.add(new SuperHeros(102, "bomberman", "bomb blast"));

		LinkedList<SuperHeros> dummySups = sups;

		int count = 0;
		System.out.println("duplicate objects");
		for (int i = 0; i < dummySups.size() - 1; i++) {
			for (int j = i + 1; j < dummySups.size(); j++) {

				if (dummySups.get(i).equals(dummySups.get(j))) {
					dummySups.remove(j);
					j--;
					count++;
				}
			}
			if (count > 0) {
				System.out.println(dummySups.get(i));
			}
		}
	}

}
