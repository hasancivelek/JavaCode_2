package week2;

import java.util.Scanner;

public class Week2_2 {

	public static void main(String[] args) {
		
		/*
		 * 1 ) In if else blocks, only one block will be executed, but in switch
		 * case statements, multiple block(case) can be executed 2 ) Switch case
		 * is only checking the equality between key and value but in if else
		 * blocks, we can create complex boolean expressions Break Statemet :
		 * It kills the switch case flow
		 */

		// Key, value

		// Key : int, String, char
/*
		int key = 90;

		switch (key) {

		case 100: // value = 1
			System.out.println("This is case 1");
			break;
		case 99: // value = 2
			System.out.println("This is case 2");
			break;
		case 3: // value = 3
			System.out.println("This is case 3");
			break;
		default:
			System.out.println("Default");

		}

		String name = "X Æ A-12";

		switch (name) {

		case "James":
			System.out.println("Robert's kid");
			break;
		case "X Æ A-12":
			System.out.println("Elon Musk's kid");
			break;
		case "Ahmet":
			System.out.println("Ihsan's kid");
			break;
		}

		// Create a simple calculator with switch case statements

		char operator = '/';

		double num1 = 9, num2 = 10;

		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;

			

		}
		*/
		// Scanner object
				Scanner scanner = new Scanner(System.in);// scanner name is identifier
				
				System.out.println("Please enter your name : ");
				
				// Taking String value from user
				String name  = scanner.nextLine(); // nextline is creating a scanner in console
				System.out.println("Your name is : " + name);
				
				
				// Taking integer value from user
				System.out.println("Please enter your age : ");
				int age = scanner.nextInt(); // nextInt is creating a scanner in the console
				System.out.println("Your age is  : " + age);

				// Taking double value from user
				System.out.println("Please enter your height : ");
				double height = scanner.nextDouble();
				System.out.println("You heigt is : " + height + " meter");
				
				// Taking a char from user
				System.out.println("Please enter a character : ");
				char myChar = scanner.next().charAt(0);
				System.out.println("This is the character that you put: " + myChar);
				
				
		

	}

}
