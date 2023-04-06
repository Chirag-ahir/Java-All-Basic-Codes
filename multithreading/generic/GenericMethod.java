package com.miit.generic;

public class GenericMethod <T>{
	T thingToPrint;
	
	public GenericMethod(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		System.out.println(thingToPrint);
	}
}
