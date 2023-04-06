package com.miit.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		
		List<String> listObject = new ArrayList<String>();
		listObject.add("Java");
		listObject.add("Selenium");
		listObject.add("Python");
		listObject.add("Java Script");
		listObject.add("Cloud Computing");

		ListIterator it = listObject.listIterator();

		System.out.println("Iterating the elements in forward direction: ");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------------------------------");

		System.out.println("Iterating the elements in backward direction: ");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}


// Difference
// An Iterator is an interface in Java and we can traverse the elements of a list in a forward direction whereas a ListIterator is an interface that extends the Iterator interface and we can traverse the elements in both forward and backward directions