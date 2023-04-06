package com.miit.generic;

public class GenericExample {
	
	public static <T,V> void shout (T thingToShout, V otherThingToShout) {
		System.out.println("First argument parameter: " + thingToShout);
		System.out.println("Second argument parameter: " + otherThingToShout);
	}
	
	public static void main(String[] args) {
		shout(12,"Aspermont");
	}
}
