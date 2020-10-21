package Week6_Recap;

import java.util.Scanner;

public class Example {
	int a;
	String bString;
	String cString;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		askName(scanner);
		askLastName(scanner);
		Example example;
		// example.SetA(example, 9,"Ahmet");
	}

	void SetA(Example example, int b, String a) {
		example.a = b;
		example.bString = a;

	}

	static void askName(Scanner input) {
		System.out.println("What is your name : ");

		String name = input.next();
		System.out.println("Your name is " + name);

	}

	static void askLastName(Scanner input) {
		System.out.println("What is your Last name : ");

		String lastname = input.next();
		System.out.println("Your Last name is " + lastname);

	}

}
