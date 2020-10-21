package Week6_Recap;

import Week7_1.ThisKeyWordConcept;

public class Person {

	String name;
	int age;

	public static void main(String[] args) {

	// Class reference
		Person person1; // We don't constructor
	     person1 = new Person(); // We initialized an object

		person1.age = 5;
		person1.name = "Tony";
		System.out.println(person1.age+" "+person1.name);

	}

}
