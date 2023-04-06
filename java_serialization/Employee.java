package java_serialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L; // Serial Version UID
	// SerialVersionUID is a unique identifier for each class, JVM uses it to
	// compare the versions of the class ensuring that the same class was used
	// during Serialization is loaded during Deserialization. Specifying one gives
	// more control, though JVM does generate one if you don't specify.

	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
