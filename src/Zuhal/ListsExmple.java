package Zuhal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListsExmple {

	public static void main(String[] args) {
		
	/////	LIST OF INTEGERS CONTAINS ODD NUMBER	/////
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(0, 9);
		list.add(1, 8);
		list.add(2, 3);
		for (int i : list) {
			if(i%2 !=0){
				System.out.println(i+" is an odd number");
				}
			}
		
																		/////	REVERSE LINKED LIST	/////
																		
																		LinkedList<Integer> lnk=new LinkedList<Integer>();
																		lnk.add( 9);
																		lnk.add( 8);
																		lnk.add( 3);
																		
																		System.out.println(lnk);
																		
																		LinkedList<Integer> rvrsd=new LinkedList<>();
																		lnk.descendingIterator().forEachRemaining(rvrsd::add);
																		
																		System.out.println(rvrsd);
																		
		/////	HOW TO MERGE 2 LISTS	/////
																		
	List<Integer> my=new ArrayList<>();
	my.add(5);
	List<Integer> my1=new ArrayList<>();
	my1.add(9);
	
	List<Integer> merged=new ArrayList<>(my);
	merged.addAll(my1);
	
	System.out.println(merged);
	

	/////	ITERATION OF LIST	/////
	
	//List<Integer> myList=new ArrayList<>();
	LinkedList<Integer> lnki=new LinkedList<Integer>();
	lnki.add( 9);
	lnki.add( 8);
	lnki.add( 3);
	Iterator<Integer> iterator=lnki.iterator();
	while(iterator.hasNext()){
	System.out.print(iterator.next()+" ");
	}
	System.out.println();
	
	LinkedList<String> mine=new LinkedList<>();
	mine.add("s");
	mine.add("t");
	mine.add("r");
	mine.add("i");
	mine.add("n");
	mine.add("g");
	System.out.println(mine);
	Iterator<String> it=mine.iterator();
	while(it.hasNext()){
		System.out.print(it.next()+"");
	}
	
		///// LINK LISTI YAZMA ///
    
LinkedList<String> str=new LinkedList<>();
str.add("s"); str.add("t"); str.add("r"); str.add("i"); str.add("n"); str.add("g");
System.out.println(str);

				//// LINK LISTI TERSEN YAZMA STRING ///

LinkedList<String> strR=new LinkedList<>();
str.descendingIterator().forEachRemaining(strR::add);
System.out.println(strR);
	

	}

	  	}



