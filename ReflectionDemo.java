package java_reflection;

class Employee {
	int id;
	String name;
	
	static void value() {
		System.out.println("545");
	}
}

public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException {

		Employee e = new Employee();

		// Object.getClass() syntex
		Class name = e.getClass();
		System.out.println(name);

		name = "hello".getClass();
		System.out.println(name);

		// Using .forName syntex
		Class name1 = Class.forName("java_reflection.Employee");
		System.out.println(name1);
		System.out.println(name1.getMethods());
		
		// using .class syntex
		Class ename = Employee.class;
		System.out.println(ename);

	}
}
