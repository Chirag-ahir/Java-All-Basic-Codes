package com.miit.hashmap;

import java.util.HashMap;
import java.util.Map;

//Java HashMap contains values based on the key.
//Java HashMap contains only unique keys.
//Java HashMap may have one null key and multiple null values.
//Java HashMap is non synchronized.
//Java HashMap maintains no order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "Dog");
		map.put(5, "Cat");
		map.put(10, "Tiger");
		map.put(14, "Lion");
		map.put(72, "Elephant");
		map.put(5, "Tortoise");

		String animal = map.get(5);
		System.out.println(animal);

		// Iterate through loop
		for (Map.Entry<Integer, String> myAnimals : map.entrySet()) {
			int key = myAnimals.getKey();
			String value = myAnimals.getValue();
			System.out.println(key + ": " + value);
		}

	}

}
