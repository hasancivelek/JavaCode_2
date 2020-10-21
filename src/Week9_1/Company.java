package Week9_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Company {
	// Arraylist has 3 constructors, 
	// - Empty constructor
	// - List parameter constructor
	// - int initialCapacity constructor

	int number;
	ArrayList<String> employees;
	ArrayList<VectorExample> vectorExamples;
	ArrayList<Object> list;// it can store every kind of object reference

	public static void main(String[] args) {
		Company object1 = new Company();
		object1.number = 9;
		ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("ahmet", "john", "Robert"));
//employeeList.add("hasan");
//employeeList.add("zuhal");
//employeeList.add("Nihal");
//employeeList.remove(1);
//System.out.println(employeeList.get(1));
//employeeList.add(0, "meral");
//employeeList.set(0, "zuhal");
//System.out.println(employeeList.size());
//employeeList.clear();
		object1.employees = employeeList;

		// for(int i=0; i<employeeList.size();i++){
		// System.out.println(employeeList.get(i));
		// }
		
		Iterator obj = employeeList.iterator();
		 
	
		 

		while (obj.hasNext()) {
			System.out.println(obj.next());
		}

		ArrayList<VectorExample> vectorExamplesList = new ArrayList<>(
				Arrays.asList(new VectorExample(), new VectorExample(), new VectorExample()));

		object1.vectorExamples = vectorExamplesList;
//Iterator obj2=vectorExamplesList.iterator();
		
		
		ArrayList<Object> objectlist = new ArrayList<>();
		objectlist.add(4);
		objectlist.add("Strnig");
		
		object1.list = objectlist;

		Iterator obj1 = objectlist.iterator();
		while (obj1.hasNext()) {
         System.out.println(obj1.next());

		}
	}

}
