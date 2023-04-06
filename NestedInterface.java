package inner_class;

interface Showable{
	interface Message{
		void msg();
	}
}

public class NestedInterface implements Showable.Message{

	public void msg() {
		System.out.println("Hello nested interface");		
	}
	
	public static void main(String[] args) {
		NestedInterface NI = new NestedInterface();
		NI.msg();
	}

}
