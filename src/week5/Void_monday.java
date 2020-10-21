package week5;

import java.util.Scanner;

public class Void_monday {
// methods: methods are collection of statement which helps me to organize my class logic
//  access modifier
//		^	access specifier
//		^	 ^	return type
//		^    ^     ^    Method name
//		^    ^     ^    ^     parameter
//		^    ^     ^    ^        ^
	public static void main(String[] args) {
		String string="hasan civelek";
		System.out.println(string.length());
		//Scanner object= new Scanner(System.in);
		// formula to create object :Classname objectname =new Classname();
		 Void_monday object =new Void_monday(); 
		// call printHelloWord method
		 object.printHelloWorld();
		 object.printMultipleString();
		//                  argument 
		 object.printNumber(7);
		 object.age(1977);
	   // method_1 asd=new method_1(); //baska class daki bir method kullanmak icin ***onemli **
		// asd.areaOfTriangle(5, 3);//baska class daki methodu cagirmak icin
		 
	}
   //minimum requirements: returnType methodsname(){}
	void printHelloWorld(){
	System.out.println("hello world");
	//System.out.println("hello world");
}
	void printMultipleString(){
		for(int i=0; i<3; i++){
			System.out.println("java");
		}
		}
	void printNumber(int i){
		for (int j=0;j<i;j++) {
			System.out.println(j);
		}
		}
	
	void age (int year){
		System.out.println(2020-year);
	}
}
