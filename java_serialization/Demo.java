package java_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void serializationDemo() {
		try {
			Employee emp1 = new Employee(20110, "John");
			Employee emp2 = new Employee(22110, "Jerry");
			Employee emp3 = new Employee(20120, "Sam");
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
			out.writeObject(emp1);
			out.writeObject(emp2);
			out.writeObject(emp3);
			out.flush(); // It flushes the current output stream.
			out.close();
			System.out.println("Serialization has been successfully executed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void deserializationDemo() {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("test.txt"));
			Employee e1 = (Employee) oin.readObject();
			Employee e2 = (Employee) oin.readObject();
			Employee e3 = (Employee) oin.readObject();
			System.out.println(e1.id + " " + e1.name);
			System.out.println(e2.id + " " + e2.name);
			System.out.println(e3.id + " " + e3.name);
			System.out.println("Deserialization has been successfully executed.");
			oin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		serializationDemo();
		deserializationDemo();
	}

}
