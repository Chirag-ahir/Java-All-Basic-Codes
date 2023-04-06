package java_transient;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	String fname;
	String lname;
	String email;
	transient String address;

	public Student(String fname, String lname, String email, String address) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", email=" + email + ", address=" + address + "]";
	}

	//Method to serialize object
	private static void serialize(Student student) {
		System.out.println("Student serializing : " + student.toString());
		try {
			FileOutputStream fout = new FileOutputStream("student.ser");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(student);
			out.close();
			fout.close();
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	//Method to deserialize object
	private static void deserialize() {
		try {
			FileInputStream fin = new FileInputStream("student.ser");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Student s = (Student) oin.readObject();
			fin.close();
			fin.close();
			System.out.println("Student deserialized : " + s.toString());
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Student s = new Student("sanket", "sathe", "ssathe45@gmail.com", "45 Gore Rd");
		serialize(s);
		deserialize();
	}

}
