package Week7;

class SuperClass1 {
	int x;
	String y;

	public SuperClass1(int x, String y) {
		
		System.out.println("I am in Superclass constructor");
		this.x = x;
		System.out.println("I set field x");
		this.y = y;
		System.out.println("I set field y");
		System.out.println("I am going out of the superclass const");
	

	}

}

class SubClass1 extends SuperClass1 {
	int a;

	public SubClass1(int x, String y, int a) {
		super(x, y); // This needs to be first statement
		System.out.println("I am in subclass const");
		this.a = a;
		System.out.println("I set field a");
		System.out.println("This is the end of subclass const");
	}

}

public class InherintanceConcept4 {

	public static void main(String[] args) {

		SubClass1 object1 = new SubClass1(9,"Java",8);
		object1.a=12;
		object1.x=13;
		object1.y="ihsan";
		System.out.println(object1.a+" "+object1.y+" "+object1.x);
				//SuperClass1 object2 = new SuperClass1(9, "Java");
	

	}

}
