package com.miit.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	public static void main(String[] args) {
		
		List<String> listObject = new ArrayList<String>();
		listObject.add("India");
		listObject.add("Australia");
		listObject.add("England");
		listObject.add("Bangladesh");
		listObject.add("South Africa");

		Iterator it = listObject.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
