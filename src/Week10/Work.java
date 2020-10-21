package Week10;

import java.util.*;

public class Work {

	public static void main(String[] args) {

//		Set<Integer> mySet= new HashSet<>();
//		for(int i=0; i<10; i++){
//			mySet.add((int) (Math.random()*10+1));
//			System.out.print(i);
//		}
//	
//		Iterator<Integer> iterator = mySet.iterator();
//		int sum=0;
//		while(iterator.hasNext()){
//			sum =sum+ iterator.next();
//			//sum += iterator.next();
//		}
//		System.out.println(sum);
//		
//		
//		ArrayList<Integer> myList = new ArrayList<>();
//		
//		Iterator<Integer> myIterator= mySet.iterator();
//		while(myIterator.hasNext()){
//			myList.add(myIterator.next());
//			
//		}
//		System.out.println("myList : " + myList);
//		
//		Set<Integer> mySet2= new TreeSet<>();
//		for(int i=0; i< myList.size(); i++){
//			mySet2.add(myList.get(i));
//			
//		}
//		System.out.println("Tree set: "+mySet2);
//		
		int[ ] a={1,2,34,5,6};
		
		try {
			System.out.println(a[8]);
		} catch (ArrayIndexOutOfBoundsException e) {
			
System.err.println("hata");
		}
		
	}

}
