package linked_list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("HTML");
		list.add("CSS");
		list.add("JAVA");
		list.add("JS");

		System.out.println("list content: " + list);

		list.add(1, "Bootstrap");
		System.out.println("list content after adding element: " + list);

		list.addFirst("First Course");
		list.addLast("Last Course");
		System.out.println("list Content after add first last element: " + list);

		list.set(0, "Java9"); // set will replace the item
		System.out.println("l_list Content after updating first Item: " + list);

		System.out.println("after peek method: " + list.peek()); // peek retrives the first item
		System.out.println("after poll method: " + list.poll()); // poll retrives the first item and remove it
		System.out.println("list Content after poll method: " + list);

		/* Remove first and last Item */
		list.removeFirst();
		list.removeLast();
		System.out.println("list content after removing first and last Item: " + list);

		System.out.println("size of list is: " + list.size());

		list.pop();
		System.out.println("After POP method: " + list); // It will remove first value from the stack

		list.push("Keral");
		System.out.println("After Push method: " + list); // It will add item at first position

		list.offer("Monika");
		System.out.println("After Offer method: " + list); // It will add element in last

		list.offerFirst("Parth");
		System.out.println(list);
	}

}
