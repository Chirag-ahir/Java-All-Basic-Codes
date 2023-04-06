//Static polymorphism is an example of method overloading
//Method overloading means there are several methods present in a class having the same name but different types/order/number of parameters.

package com.miit.polymorphism;

class MyClass {
	int height;

	MyClass() {
		System.out.println("Bricks");
		height = 0;
	}

	MyClass(int i) {
		System.out.println("Building new house that is " + i + " feet tall");
		height = i;
	}

	void info(int height) {
		System.out.println("House is " + height + " feet tall");
	}

	void info(String s, int height) {
		System.out.println(s + ": House is " + height + " feet tall\n");
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		
		MyClass me = new MyClass();

		me.info(12);
		me.info("Overloaded Method", 12);

		new MyClass();
		new MyClass(12);
	}
}