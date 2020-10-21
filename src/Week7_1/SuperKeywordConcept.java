package Week7_1;

class ParentClass {

	int superClassField;

	public ParentClass(int a) {
		System.out.println("constructor of superclass");
		this.superClassField = a;
	}

	void method1() {
		System.out.println("method 1");
	}
}

class SubClass extends ParentClass {

	public SubClass(int a) {
		// Super keyword for invoking super class constructor
		super(a);//needs to be first statement
		System.out.println("SubClasss Constructor");
	}

	void method1() {
		// we are using super keyword to call overridden super class method
		super.method1();
	}

	void method2() {
		method1();// calling subclass method1
		super.method1();// calling superclass method1
	}
}

public class SuperKeywordConcept {

	public static void main(String[] args) {
		SubClass object = new SubClass(9);
		object.method2();

	}

}
