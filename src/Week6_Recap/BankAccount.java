package Week6_Recap;

// This example demonstrates static concept and bank account example
public class BankAccount {

	// properties
	String name;
	int balance;
	//question create a program which calculates how many transactions has been hold in the program.
	static int countTotalTransaction;
	public BankAccount(String name) {
	
		this.name = name;
		this.balance = 0;
	}
	public void withDraw(int amount){
		if(balance>0){
			balance-=amount;
			countTotalTransaction++;
		}
	}
	public void deposit(int amount){
		balance+=amount;//balance=balance+amount;
		countTotalTransaction++;
	}
	// in order to see the balance, you need to pay 2 dollars
	
	public void showBalance(){
		if(balance>2){
			balance-=2;
			System.out.println("Your balance is : " + balance);
			countTotalTransaction++;
		}
	}

	public static void main(String[] args) {
		BankAccount custermer1 = new BankAccount("Hasan");
		custermer1.deposit(500);// balance=500
		custermer1.withDraw(200);//balance=300
		custermer1.showBalance();//balance=298
		BankAccount customer2 = new BankAccount("Huseyin");
		customer2.deposit(600); // balance = 500
		customer2.withDraw(200); // balance = 300
		customer2.showBalance(); // balance = 298
		System.out.println(BankAccount.countTotalTransaction);
		

	}

}
