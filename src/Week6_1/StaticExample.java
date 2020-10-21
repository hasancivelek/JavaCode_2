package Week6_1;

public class StaticExample {

	static int numberOfObject = 0;

	public StaticExample() {
		numberOfObject++;

	}

	public static void main(String[] args) {
		// create a program which counts the number of object that has been
		// created
		StaticExample object = new StaticExample();
		new StaticExample();
		StaticExample object1 = new StaticExample();
		System.out.println(StaticExample.numberOfObject);
		// what happens when we creat an object?
		// when we creat object , we are using constructor.
	}

}
