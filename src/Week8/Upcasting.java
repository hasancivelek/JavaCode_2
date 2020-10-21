package Week8;

//up casting creating superclass reference with subclass object
class SuperClass {
	 int superClassField;

	void superClassMethod() {
System.out.println("super class method");
	}

	void overridenMethod() {
System.out.println("overridin method in super class");
	}
}

class Subclass extends SuperClass {
	int subclassField;

	void overridenMethod() {
		System.out.println("overridin method in sub class");
	}

	void supClassMethod() {
		System.out.println("subclass method");
	}
}

public class Upcasting {

	public static void main(String[] args) {
		//up casted object has access to superclass fields (except overriden method )
		//overridin methods coming from subclass
		SuperClass object = new Subclass();
	object.superClassField=9;
	object.superClassMethod();//superclass method
	object.overridenMethod();//overridin method in subclass
	//object.superClassField;

	//updating object
	//object=new SuperClass();
	//object.overridenMethod();
	

	
	}

}
