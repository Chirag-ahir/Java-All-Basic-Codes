package comparable;

public class Person implements Comparable<Person> {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// This is comparable logic it just provides only single method compareTo()
	// which takes only one parameter.
	// You can not do multiple sorting using comparable
	// Comparator affacts the original class but comparable will not

	@Override
	public int compareTo(Person other) {
		// Compare persons based on their age
		return Integer.compare(this.age, other.getAge());
	}

}
