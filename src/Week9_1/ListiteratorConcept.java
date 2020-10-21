package Week9_1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListiteratorConcept {

	public static void main(String[] args) {
		//initial capacity of arraylist 10
		
		ArrayList<Double> arrayList1= new ArrayList<Double>();
		
		
		arrayList1.add(9.9);
		arrayList1.add(42.98);
		arrayList1.add(42.99);
		arrayList1.add(40.00);
		
		
		ListIterator<Double> iterator = arrayList1.listIterator();
		
		System.out.println("Traversing forward direction");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("Traversing backward direction");
		while(iterator.hasPrevious()){
			System.out.println(iterator.previous());
	}
	}
}
