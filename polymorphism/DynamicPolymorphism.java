//Dynamic Polymorphism is an example of Method Over riding. 
//method overriding occurs when a subclass (child class) has the same method as the parent class.

package com.miit.polymorphism;

//Animal is a parant class
class Animal {
	public void move() {
		System.out.println("Animals can move");
	}
}

//Dog is a child class
class Dog extends Animal{
	public void move() {
		System.out.println("Dogs can walk and run");
	}
}

public class DynamicPolymorphism{
	public static void main(String args[]) {
		Animal a = new Animal();
		Animal b = new Dog();
		
		a.move();
		b.move();
	}
}