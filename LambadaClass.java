package A1_Interview;

import java.util.Arrays;
import java.util.List;

public class LambadaClass {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.forEach((number) -> System.out.println(number));
		// The forEach() method is called on the numbers list, and a lambda expression
		// is passed as an argument. The lambda expression (number) ->
		// System.out.println(number) takes a single integer parameter, number, and
		// prints it out using System.out.println().

		List<String> names = Arrays.asList("Keral", "MONIKA", "Parth", "Hiren", "DARSHAN");
		names.forEach((name) -> System.out.println(name.toLowerCase()));

	}
}
