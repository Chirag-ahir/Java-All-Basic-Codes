package com.miit.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>(); // generic way to declare arraylist
		list.add("swati");
		list.add("asit");
		list.add("sadam");
		list.add("shruti");

		System.out.println("content of arrylist: " + list);

		int pos = list.indexOf("sadam");// using indexOf() to find index of sadam
		System.out.println("The element sadam is at index :" + pos);

		System.out.println("--------------------after iterator---------------------");

		Iterator<String> itr = list.iterator();// Traversing list through Iterator
		while (itr.hasNext()) {// check if iterator has the elements
			System.out.println(itr.next());// printing the element and move to next
		}

		System.out.println("--------------------after foreach---------------------");
		list.forEach(System.out::println); // Traversing list thrrough foreach

		System.out.println("After get method: " + list.get(0)); // get() method returns the element at the specified
																// index

		list.set(3, "jayraj"); // set() method changes the element.
		System.out.println("After set method: " + list);

		Collections.sort(list);
		System.out.println("After sorting method: " + list);

		Collections.reverse(list);
		System.out.println("After reverse method: " + list);

		// creating new arraylist
		ArrayList<String> empNames = new ArrayList<>();
		empNames.add("swati");
		empNames.add("jashan");
		empNames.add("simaran");
		empNames.add("kuldeep");

		list.retainAll(empNames); // it will return common elements in both array
		System.out.println("After retailAll method: ");
		list.forEach(System.out::println);

		list.addAll(empNames);
		System.out.println("After addAll method: " + list);

		System.out.println("Is ArrayList Empty: " + list.isEmpty());

		System.out.println("The size of the arraylist is: " + list.size());

		System.out.println("After contains method: " + list.contains("swati"));

		list.removeAll(empNames);
		System.out.println("After remove all method: " + list);

		list.clear();
		System.out.println("After clear method: " + list);

	}

}

//contains duplicate elements
//maintains insertion order
//non synchronized 
//lot of shifting needs to occur if any element is removed from the array list.
