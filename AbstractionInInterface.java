package java_abstraction;

interface A {
	void a();
	void b();
}

abstract class BaseClass implements A {
	abstract void c();
}

class ChildClass extends BaseClass {
	public void a() {
		System.out.println("This is a");
	}

	public void b() {
		System.out.println("This is b");
	}

	public void c() {
		System.out.println("This is c");
	}
}

public class AbstractionInInterface {
	public static void main(String[] args) {
		ChildClass CC = new ChildClass();
		CC.a();
		CC.b();
		CC.c();

		A CCA = new ChildClass(); // ref object CCA is of interface A and we assign class ChildClass to object CCA
		CCA.a();
	}
}
