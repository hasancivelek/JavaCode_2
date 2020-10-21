package Week9_1;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		// Vector is synchronized, comparatively slower than arraylist
				// By default arraylist is not syncronized, but can be synchronized explicitly
				// with Collections.synchronizedList
		
		long time1 = System.nanoTime();
		
		Vector object = new Vector<>();

		object.add("ahmet");
		object.add("hasan");
		object.add("john");
		//object.add(23);
	//	object.forEach((n) -> System.out.print(n)); lambda expression
		
		for (Object object2 : object) {
			System.out.println(object2);
	}
		long time2 = System.nanoTime();

		long time3 = System.nanoTime();
		
		ArrayList object1 = new ArrayList<>();
		
		object1.add("ahmet");
		object1.add("hasan");
		object1.add("john");
		
		for (Object object2 : object1) {
			System.out.println(object2);
		}
		long time4 = System.nanoTime();

		System.out.println("Vector Speed : " + (time2 - time1));
		System.out.println("ArrayList Speed : " + (time4 - time3));

	}
}
