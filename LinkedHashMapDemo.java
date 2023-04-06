package com.miit.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		sortedMaps(linkedHashMap);
	}

	public static void sortedMaps(Map<Integer, String> map) {

		map.put(4, "ice cream");
		map.put(8, "pie");
		map.put(0, "pizza");
		map.put(2, "hamburger");
		map.put(12, "fries");
		map.put(27, "hot dog");

		for (Integer numbers : map.keySet()) {
			String food = map.get(numbers);
			System.out.println(numbers + ": " + food);
		}

	}

}
