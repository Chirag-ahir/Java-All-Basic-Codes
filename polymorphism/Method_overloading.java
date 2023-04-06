package com.miit.polymorphism;

public class Method_overloading {
	
	//class have multiple methods having same name but different in parameters, it is known as Method Overloading.
	public static class Adder{
		static int add(int a,int b){return a+b;};
		static int add(int a,int b,int c){return a+b+c;};
	}
	
	public static void main(String args[]) {
		System.out.println(Adder.add(2, 3));
		System.out.println(Adder.add(1, 3, 5));
	}

}
