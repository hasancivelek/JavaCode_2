package week2;

import java.util.Scanner;

public class Lab_2_2 {

	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the First Number"); int number =
		 * scan.nextInt(); System.out.println("Enter the Second Number"); int
		 * number1 = scan.nextInt();
		 * System.out.println("Enter the Operator(*,/,+,-)"); char operator =
		 * scan.next().charAt(0); if (operator == '+') {
		 * System.out.println(number + number1);
		 * 
		 * } else if (operator == '-') { System.out.println(number - number1);
		 * 
		 * } else if (operator == '*') { System.out.println(number * number1);
		 * 
		 * } else if (operator == '/') { System.out.println(number /
		 * number1(f));
		 * 
		 * } else if (operator == '%') { System.out.println(number % number1);
		 * 
		 * } else{ 
		 * system.out/println("invalid operator");
		 * }
		 *
		 * 
		 * 
		 * 
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("Enter the First Nunber"); int num =
		 * input.nextInt(); System.out.println("Enter the Second Number"); int
		 * num1 = input.nextInt(); System.out.println("Enter the Third Number");
		 * int num2 =input.nextInt(); if(num==num1&&num1==num2){
		 * System.out.println("Equilateral Triangle"); } else
		 * if(num==num1&&!(num1==num2)){//side1==side2||
		 * side1==side3||side2==side3 System.out.println("Isosceles Triangle");
		 * } else { System.out.println("Scalene Triangle"); }
		 * 
		 * 
		 * 
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("enter the week day"); int key = scan.nextInt();
		 * switch (key) { case 1: System.out.println("Today is Monday"); break;
		 * 
		 * case 2: System.out.println("Today is Tuesday"); break; case 3:
		 * System.out.println("Today is Wednesday"); break; case 4:
		 * System.out.println("Today is Thursday"); break; case 5:
		 * System.out.println("Today is Friday"); break; default:
		 * System.out.println("Invalid Number"); }
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Age");
		int age1 = scan.nextInt();
		System.out.println("Enter the Second Age");
		int age2 = scan.nextInt();
		System.out.println("Enter the Third Age");
		int age3 = scan.nextInt();

		if (age1 > age2 && age1 > age3) {
			System.out.println("Age 1 is The Oldest One");
		} else if (age2 > age1 && age2 > age3) {
			System.out.println("Age 2 is The Oldest One");

		} 
		else if (age3>age2&&age3>age1){
			System.out.println("Age 3 is The Oldest One");
			
		}
		else {
			System.out.println("Same Age");
}

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter current count for seniorCitizens");
		int seniorCitizens = scan.nextInt();
		System.out.println("Enter current count for nonSeniorCitizens");
		int nonseniorCitizens = scan.nextInt();
		System.out.println("What is new citizen's age?");
		int age = scan.nextInt();
		if (age < 65) {
			System.out.println("New nonSeniorCitizens count : " + (nonseniorCitizens + 1));
			System.out.println("New seniorCitizens count : " + seniorCitizens);

		} 
		else {

			System.out.println("New seniorCitizens count : " + (seniorCitizens + 1));
			System.out.println("New nonseniorCitizens count : " + nonseniorCitizens);
		
		}
		
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of coupons");
		int numberCoupons = scan.nextInt();
		int numberofCandy = numberCoupons / 10;
		int number = numberCoupons % 10;
		int numberGum = number / 3; // int numberGum=(numberCoupons%10)/3
		int extraCoupons = numberCoupons - (numberofCandy * 10 + numberGum * 3);
		if (numberCoupons >= 3) {
			System.out.println("Number of Candy = " + numberofCandy);
			System.out.println("Number of Gum = " + numberGum);

		} else {
			System.out.println("Not enough coupons");

		}
		System.out.println("remind coupons "+ extraCoupons);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
