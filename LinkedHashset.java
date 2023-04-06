package linked_hashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {
	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("alpha");
		set.add("bravo");
		set.add("alpha");
		set.add("trio");

		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("The hashset is: " + set);

		set.remove("trio");
		System.out.println("The hashset after removing trio: " + set);

		// check whether set is empty or not
		System.out.println(set.isEmpty());

		set.clear();
		System.out.println("The hashset after clear method: " + set);

	}
}

/*
 * points to remembers Java LinkedHashSet class contains unique elements only
 * like HashSet. Java LinkedHashSet class provides all optional set operations
 * and permits null elements. Java LinkedHashSet class is non-synchronized. Java
 * LinkedHashSet class maintains insertion order.
 */