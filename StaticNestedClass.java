package inner_class;

public class StaticNestedClass {
	
	static int data = 30;
	static class Inner{
		static void msg() {
			System.out.println("data is: " + data);
		}
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		StaticNestedClass.Inner SI = new StaticNestedClass.Inner();
		SI.msg();
		
		StaticNestedClass.Inner.msg(); //no need to create instance of static class
	}

}
