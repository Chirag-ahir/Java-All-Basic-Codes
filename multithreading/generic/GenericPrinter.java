package com.miit.generic;

public class GenericPrinter {
	public static void main(String[] args) {
		
		GenericMethod<Integer> intPrinter = new GenericMethod<>(100); //We can define any type of variable
		intPrinter.print();
		
		GenericMethod<Double> doublePrinter = new GenericMethod<Double>(290.09);
		doublePrinter.print();
		
	}
}
