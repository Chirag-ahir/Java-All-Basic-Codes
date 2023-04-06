package A1_Interview;

import java.util.Arrays;
import java.util.List;

public class StramAPI {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice");
		names.stream() // create a stream from the list
				.filter(n -> n.startsWith("J")) // filter out names that don't start with "J"
				.sorted() // sort the remaining names alphabetically
				.forEach(System.out::println); // print each name to the console

	}
}
