package Week8;

public class MyClass {
	// attributes global variables instance variable
	int x;
	String y;

	// constructor :special block - method which we can initialize -instantiating objects
	// if we don't declare constructor ,java provides no parameter constructor
	public MyClass(int x, String y) {
		this.x = x;
		this.y = y;
		System.out.println("two parameters constructor has been triggered");
	}

	public MyClass() {
		this(4, "hasan");

		System.out.println("no parameters constructor has been triggered");
	}

	public static void main(String[] args) {
		MyClass object1 = new MyClass(8, "String");
		//MyClass object2 = new MyClass(99, "String buffer");
		MyClass object3 = new MyClass();

	}
}