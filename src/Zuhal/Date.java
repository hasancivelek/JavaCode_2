package Zuhal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

import Week6_1.StaticExample;

import java.util.LinkedList;


import week_4.wed_while_2dimensional;

public class Date {

	public static void main(String[] args) {
	
		/////// DATE FORMAT		////
		
	String pattern="MM-dd-yyyy";
	SimpleDateFormat myDateFormat=new SimpleDateFormat(pattern);
	String date=myDateFormat.format(new java.util.Date());
	System.out.println(date);
	
	
																// RUN Command Line ------>>>>>   javac Test.java	java.Test //

	/////	ITERATION OF LIST	/////
	
	//List<Integer> myList=new ArrayList<>();
	LinkedList<Integer> lnk=new LinkedList<Integer>();
	lnk.add( 9);
	lnk.add( 8);
	lnk.add( 3);
	Iterator<Integer> iterator=lnk.iterator();
	while(iterator.hasNext()){
	System.out.print(iterator.next()+" ");
	}
	System.out.println();
	/////	INTERFACE DEFAULT AND STATIC METHOD	/////
	
	/* regular abstract method ------->>> void method(String str);
				default method ------->>>>>    default void log (String string){
												System.out.println("    ");
								static method  ------->>> static boolean isNull(String str){
															System.out.println("    ");						
									*/

																///// LAMBDA EXXPRESSION  EXAMPLE	////
																			// Runnable is functional interface. I have created runnable.
																Runnable R1=() -> System.out.println("My Runnable");
	
														// WITH REGULAR EXPRESSION	//
																
																LinkedList<String> lnku=new LinkedList<>();
																lnku.add( "zuhal");
																lnku.add( "nihal");
																lnku.add("zerrin");	
																int count=0;
																	for(int i=0;i<lnku.size();i++){
																	String string=lnku.get(i);
																	if(string.startsWith("z")){
																		count++;
																	}}
																	System.out.println(count);
															// WITH LAMBDA EXPRESSION	//
																	
															long dd=lnku.stream().filter(s -> s.startsWith("z")).count();
															System.out.println(dd);


}}
