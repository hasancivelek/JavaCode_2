package Week7_Lab;

import java.util.Scanner;

class Account {
	String name;
	String acc_type;
	int Acc_num;
	int Acc_Balance;

	public Account(String name, int acc_num, int acc_Balance, String acc_type) {
		super();
		this.name = name;
		this.acc_type = acc_type;
		this.Acc_num = acc_num;
		this.Acc_Balance = acc_Balance;
	}
}

class create_account extends Account {

	public create_account(String name, int acc_num, int acc_Balance, String acc_type) {
		super(name, acc_num, acc_Balance, acc_type);
	}

	void insert(String n, int acc_num, String a_t) { // input user name,
														// account number
														// and type
		name = n;
		acc_type = a_t;
		Acc_num = acc_num; // generate random number
		Acc_Balance = 0;
	}

	void dispaly_details() {
		System.out.println("Customer holder Name :" + name);
		System.out.println("Account Number : " + Acc_num);
		System.out.println("Account Balance : " + Acc_Balance);
		System.out.println("Account Type : " + acc_type);

	}

	public void deposit(int amount) {
		Acc_Balance += amount;
	}

	public void withdraw(int amount) {
		Acc_Balance -= amount;
	}

	int random() {
		// These constant numbers (9000,1000 can be changed)
		int randomNumber = (int) ((Math.random() * 9000) + 1000);
		return randomNumber;

	}

}

public class Lab_Question {

	public static void main(String[] args) {
		create_account obj = new create_account("hasan", 66, 1200, "checking");
		//obj.deposit(1000);
	//	obj.withdraw(250);
	//	obj.dispaly_details();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Deposit money");
		System.out.println("2. Withdraw money");
		System.out.println("3-Display Details");
		System.out.println("4-update info");
		System.out.println("5-exit");

		boolean check = true;
		do {
			int userChoice1 = scanner.nextInt();

			switch (userChoice1) {

			case 1: // Deposit
				System.out.print("Enter Amount Of Money : ");
				int balance = scanner.nextInt();
				obj.deposit(balance);
				System.out.println("\t Successfully Deposited.");
				break;

			case 2: // withdraw money
				System.out.print("Enter Amout Of Money : ");
				int withdraw = scanner.nextInt();
				obj.withdraw(withdraw);
				System.out.println("Your Current Balance : " + obj.Acc_Balance);
				break;

			case 3:
				System.out.println("your info");

				obj.dispaly_details();

				break;
			case 4:
				System.out.println("enter name");
				String newName = scanner.next();
				System.out.println("enter your Account type");
				String newType = scanner.next();
				int newAccountNumber = obj.random();
				obj.insert(newName, newAccountNumber, newType);
				obj.dispaly_details();
				break;
			case 5:
				System.out.println("exit");
				System.out.println("thank you for choosing our bank");
				check = false;
				break;
			}
		} while (check);
	}
}