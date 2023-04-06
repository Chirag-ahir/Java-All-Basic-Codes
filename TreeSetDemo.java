package com.miit.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(8);
		treeSet.add(6);
		treeSet.add(5);
		treeSet.add(3);
		treeSet.add(4);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(7);
		treeSet.add(9);
		
		System.out.println("Treeset = " + treeSet); //follows ascending order bydefault 
		
		System.out.println("Subset = " + treeSet.subSet(6, 10));
		System.out.println("Headset = " + treeSet.headSet(5));
		System.out.println("Headset = " + treeSet.tailSet(6));
		System.out.println(treeSet.lower(9));
		
	}

}
