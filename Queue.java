package com.miit.queue;

import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("alpha");
		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Karan");
		queue.add("Jai");
		queue.add("Rahul");

		System.out.println(queue);

		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		
		queue.offer("parth"); //adds element at the last
		
		queue.remove();  //remove first head element 
		queue.poll();  //remove first head element
		
		System.out.println(queue);
	}

}

/*
 * null not allowed default capacity is 11 not maintains insertion order
 * contains duplicate element
 */