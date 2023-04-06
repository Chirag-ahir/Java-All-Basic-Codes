package com.miit.polymorphism;
//Compiletime polymorphism is a example of method overloading.
//Compile-time polymorphism is achieved by method overloading and operator overloading.

public class CompileTimePolymorphism {

	void show(int num1) {
		System.out.println("number 1 : " + num1);
	}

	void show(int num1, int num2) {
		System.out.println("number 1 : " + num1 + "  number 2 : " + num2);
	}

	public static void main(String[] args) {
		CompileTimePolymorphism obj = new CompileTimePolymorphism();
		obj.show(3);
		obj.show(4, 5);
	}

}
