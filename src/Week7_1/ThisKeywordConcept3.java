package Week7_1;

class Example2 {

	Example3 object1;

	public Example2(Example3 object1) {
		System.out.println("4"+"we are in side of the example 2 constructor");
		this.object1 = object1;
		System.out.println("5"+"we initialized object1 into parameter reference");
		System.out.println("6"+"we are goin to our example 3 constructor");
	}

	void display() {
		System.out.println("8"+"we are the inside of the display method");
		System.out.println("9"+object1.data);
		System.out.println("10"+"we are going to out of the display");
	}
}

class Example3 {
	int data = 10;

	public Example3() {
		System.out.println("2"+"this is example 3 constructor");
		System.out.println("3"+"we are  inside of the example 2 constructor , as a parameter we are putting this keyword");
		Example2 object = new Example2(this);
		System.out.println("7"+"i am inside of the example 2 constructor , we are going to display method");
		object.display();
		System.out.println("11"+"we are goingto of Examle 3 constructor");

	}

}

public class ThisKeywordConcept3 {

	public static void main(String[] args) {
System.out.println("1"+"we are going to in side of the Example3 constructor");
		Example3 example3 = new Example3();
		System.out.println("12"+"we are in the main method and program is finished");
		
	}

}
