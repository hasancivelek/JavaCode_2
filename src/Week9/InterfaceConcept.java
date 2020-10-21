package Week9;

interface IInterface {
	int a = 9;
	// variables are final and static by default,and can not be private
	// abstract methods
	// global variables
	// no constructors
	// can not be instantiated
	// no concrete methods(default -static)

	void massage(); // Abstract method , abstract keyword is optional

}

interface IInterface2 {
	void massage1();
}

class A implements IInterface, IInterface2 {

	@Override
	public void massage() {

		System.out.println("Message");

	}

	@Override
	public void massage1() {

		System.out.println("Message1");

	}

}

public class InterfaceConcept {

}
