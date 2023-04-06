package inner_class;
//A class i.e., created inside a method, is called local inner class in java.

public class LocalInnerClass {

	private int data = 30;

	void display() {
		class Local {
			void msg() {
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String[] args) {
		LocalInnerClass LIC = new LocalInnerClass();
		LIC.display();
	}

}
