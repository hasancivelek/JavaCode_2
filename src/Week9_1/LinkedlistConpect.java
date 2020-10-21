package Week9_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistConpect {
	
	
	public static void main(String[] args) {
		// Arraylist uses dynamic array - Linked list uses doubly linked list
		// Arraylist manipulation is slower than LinkedList
		// Linked list acts like list and queue, arraylist acts like a list
		// Arraylist is good for accessing or sorting the data
		// Linked is better for data manipulation

		// Linkedlist is also oredered and it keeps it's insertion order
		LinkedList linkedList = new LinkedList<>();
		
		linkedList.add(3);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add("asd");

		linkedList.forEach((n) -> System.out.println(n));
		
		// Print it with for loop
//		for (int i = 0; i < linkedList.size(); i++) {
//			System.out.println(linkedList.get(i));
//
//		}

		// for (Object object : linkedList) {
		// System.out.println(object);
		// }

		
//		Iterator iterator= linkedList.iterator();
//
//while(iterator.hasNext()){
//	System.out.println(iterator.next());
//
//}
	}

}
