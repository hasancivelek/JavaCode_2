package Week10_Lab;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Question7 {

	public static void main(String[] args) {

		Set<Integer> set1 = new TreeSet<>();

		set1.add(3);
		set1.add(34);
		set1.add(45);
		set1.add(45);
		Iterator<Integer> iterator = set1.iterator();
		System.out.println("Set list: ");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}

		System.out.println("*************");

		ArrayList<Integer> list = new ArrayList<>();

		Iterator<Integer> iterator2 = set1.iterator();

		System.out.println("Convert set to Array");

		while (iterator2.hasNext()) {
			list.add(iterator2.next());

			System.out.print(list);

		}

	}

}
