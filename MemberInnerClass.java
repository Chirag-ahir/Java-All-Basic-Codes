package inner_class;
//A non-static class that is created inside a class but outside a method is called member inner class.

public class MemberInnerClass {
	
	private int data = 60;
	
	class Inner{
		void msg() {
			System.out.println("Data is: " + data);
		}
	}
	
	public static void main(String[] args) {
		MemberInnerClass MIC = new MemberInnerClass(); //instance of outer class
		MemberInnerClass.Inner IN = MIC.new Inner();//instance of inner class
		
		IN.msg();
	}
}
