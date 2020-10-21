package Week9_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample2 {

	public static void main(String[] args) {

		//generic ArrayList		
ArrayList<String> arrayList= new ArrayList<String>();
arrayList.add("String");
//arraylist.add(5);


ArrayList<Double> arrayList1 = new ArrayList<Double>();
	
	
	arrayList1.add(9.9);
	arrayList1.add(42.98);
	arrayList1.add(42.99);
	arrayList1.add(40.00);
	//arrayList1.remove(0);
	
	
	//System.out.println(arrayList1);
	//iterator
	
	Iterator iterator =arrayList1.iterator();
	
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
	
	// for loop
	//for (int i = 0; i < arrayList1.size(); i++) {
	//	if(iterator.hasNext()){
		//	System.out.println(iterator.next());
			
		}
	//	}
	
	}

//}
