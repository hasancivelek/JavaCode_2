package Week8_1;

//Abstract Classes
abstract class SuperClass {
	int a;

	// we can create method without body(with abstract keyword)
	// we can not instantiate abstract classes
	// Abstract classes can have 0 or more abstract methods
	// abstract classes can have concrete methods
	//abstract classes have abstract methods
	//if there is an abstract method in superclass,it needs to be overriden (implemented) in subclass
	
	// abstract method
	abstract void add();

	abstract void display();

	void concreteMethod() {
		System.out.println("Concrete Method");
	}

	// Abstract classes can have constructors
	public SuperClass() {

	}

}

class Subclass extends SuperClass {
	// we need to override abstract method in the superclass
	void add() {
		System.out.println("Subclass overriden add()");
	}

	void display() {
		System.out.println("Subclass overriden display()");
	}
}

// Concrete Classes
public class AbstarctConcept1 {

	// concrete method
	public static void main(String[] args) {
SuperClass obj= new Subclass();
obj.add();
obj.concreteMethod();
obj.display();
		
	}
}
