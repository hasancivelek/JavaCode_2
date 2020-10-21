package Week7_Recap;

import java.util.Scanner;

class Account {
	String name;
	int balance;

	public Account(String name, int balance) {
		//this.name = name;// this keyword acts like reference to the class object
		//this.balance = balance;
	}
}

class CreatAccount extends Account {
	// inherited String name;
	public CreatAccount(String name, int balance) {
		super(name, balance);// This super keyword invoke Account constructor
	}

	void insert(String n) {// take input user and assign it to name
		name = n;
	}

	void withDraw(int amount) {
		balance -= amount;
	}

	void deposit(int amount) {
		balance += amount;
	}

}

public class Example1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is costomer's name");
		
		String customerName = scanner.next();
		
		System.out.println("What is customer's balance");
		
		int customerBalance = scanner.nextInt();

		CreatAccount object1 = new CreatAccount(customerName, customerBalance);

	}

}
