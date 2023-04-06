package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Alice", 25));
		persons.add(new Person("Bob", 30));
		persons.add(new Person("Charlie", 20));

		Collections.sort(persons); // Sorts the persons list based on their age
		System.out.println(persons);

	}
}
