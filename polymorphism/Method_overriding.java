package com.miit.polymorphism;

class Parent {
	void run() {
		System.out.println("Wheels are running.");
	}
}

class Method_overriding extends Parent {
	
	//child class has the same method as declared in the parent class, it is known as method overriding in Java.
	void run() {
		System.out.println("Wheels are not running");
	}

	public static void main(String args[]) {

		Method_overriding ch = new Method_overriding();
		ch.run();
		

	}
}
