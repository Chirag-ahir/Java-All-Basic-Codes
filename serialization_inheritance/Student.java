package serialization_inheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Child implements Serializable {
	String stu_name;

	Child(String stu_name) {
		this.stu_name = stu_name;
	}
}

@SuppressWarnings("serial")
public class Student extends Child {
	int stu_id;

	Student(int stu_id, String stu_name) {
		super(stu_name);
		this.stu_id = stu_id;
	}

	static void serialization() {
		Student s = new Student(101, "jiya");
		try {
			FileOutputStream fout = new FileOutputStream("test.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(s);
			oos.flush();
			oos.close();
			System.out.println("Object serializaed and saved!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deserialization() {
		try {
			FileInputStream fin = new FileInputStream("test.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Student s1 = (Student)oin.readObject();
			System.out.println(s1.stu_id + " " + s1.stu_name);
			oin.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		serialization();
		deserialization();
	}

}
