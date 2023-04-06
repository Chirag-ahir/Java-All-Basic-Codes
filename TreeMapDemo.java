package com.miit.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		sortedMaps(treeMap);
	}

	public static void sortedMaps(Map<Integer, String> map) {
		map.put(4, "ice cream");
		map.put(8, "pie");
		map.put(0, "pizza");
		map.put(2, "hamburger");
		map.put(12, "fries");
		map.put(27, "hot dog");

		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

}
