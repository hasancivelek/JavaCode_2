package Week10;

import java.util.*;

public class SetEaxample {

	public static void main(String[] args) {
		//HashSet stores data in hash table , not maintaining insertion order
		//only unique elements
		
		HashSet<String> set1 = new HashSet<>();// Set<String> set1 = new HashSet<>();
		
		set1.add("Selenium");
		set1.add("Java");
		set1.add("Ruby");
		set1.add("Python");
		set1.add("Java");

		System.out.println(set1);
		
//		Set mySet=new HashSet<>();
//		mySet.add(34);
//		mySet.add("hasan");
//		System.out.println(mySet);
//		Iterator iterator=mySet.iterator();
//	
	
	//maintaining insertion order// Maintains insertion order
LinkedHashSet<String> set2 = new LinkedHashSet<>();
		
		set2.add("Selenium");
		set2.add("Java");
		set2.add("Ruby");
		set2.add("Python");
		set2.add("Java");

		System.out.println(set2);
		
		
		//TreeSet stores data in ascending or numeric order
		
		
    Set<String> set3 = new TreeSet<>();
		
		set3.add("Selenium");
		set3.add("Java");
		set3.add("Ruby");
		set3.add("Python");
		set3.add("Java");

		System.out.println(set3);
		
		
		
		TreeSet<Integer> set4 = new TreeSet<>();
		set4.add(4);
		set4.add(3);
		set4.add(9);
		set4.add(1);
		set4.add(100);
		set4.add(8);
		
		System.out.println(set4);
		
		Iterator<Integer> itarator=set4.iterator();
		System.out.println("TreSet set4: ");
		while(itarator.hasNext()){
			System.out.print(itarator.next()+" ");
		}
		
		
		
		
	
	
	}
	
	

}
