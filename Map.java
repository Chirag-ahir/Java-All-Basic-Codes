package com.miit.MapInterface;

import java.util.HashMap;

public class Map {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("dhara", 111); // dhara is key 111 is value
		map.put("pooja", 112);
		map.put("swati", 113);

		System.out.println(map);

		System.out.println(map.entrySet());

	}
}

/*
 * duplication not allowed 
 * not maintains insertion order 
 * default capacity
 */