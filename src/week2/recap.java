package week2;

import java.util.Scanner;

public class recap {

	public static void main(String[] args) {
		/*
		 * int weather = 0; switch (weather) {
		 * 
		 * case 0: System.out.println("sunny"); break;
		 * 
		 * case 88: System.out.println("rain"); break; case -90:
		 * System.out.println("clody"); break;
		 * 
		 * default: System.out.println("invalid input");
		 * 
		 * }
		 *if our number is divisible by 2 ( 0 remainder), we will print Fizz if
		 * our number is divisible by 3 ( 0 remainder), we will print Buzz if
		 * our number is divisible by 2 and 3 ( 0 remainder), we will print FizzBuzz
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the Number"); int number
		 * =scanner.nextInt();
		 * 
		 * if(number%6==0){ //2ve 3 de bolunmesi gerekiyor
		 * or(number%2==0&&number%3==0) System.out.println("FizzBuzz"); } else
		 * if (number%3==0){ System.out.println("Buzz"); } else if(number%2==0){
		 * System.out.println("Fizz");
		 * 
		 * } else{ System.out.println("Neither Fizz or Buzz");
		 * 
		 * }
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("What is the Grade of The Student: ");
		String Grade = input.next();
		switch (Grade) {

		case "A":
		case"a":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Very Good");
			break;
		case "C":
			System.out.println("Good");
			break;
		case "D":
			System.out.println("You are smart but you need to stady more");
			break;
		case "F":
			System.out.println("Try again next semester");
			break;
		default:
			System.out.println("Invalid Input");

		}

	}

}
