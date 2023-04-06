package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class App {
	public static void main(String[] args) {

		ArrayList<Employee> ems = new ArrayList<>();
		ems.add(new Employee(158, "Chirag", 22));
		ems.add(new Employee(458, "Parth", 24));
		ems.add(new Employee(144, "Sanket", 18));
		ems.add(new Employee(180, "Keral", 26));
		ems.add(new Employee(78, "Monika", 28));

		// Sorting based on Id
		Collections.sort(ems, new IdComparator());
		System.out.println(ems);

		// Sorting based on name
		Collections.sort(ems, new NameComparator());
		System.out.println(ems);

		// Sorting based on age
		Collections.sort(ems, new AgeComparator());
		System.out.println(ems);

	}
}
