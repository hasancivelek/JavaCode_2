package Week6;

//this example demonstrates 3 ways to initialize object
// with method, directly accessing the fields and constructor
//When we create a constructor, default constructor would be no longer valid
public class IniObject {
	
	String aString;
	int aInt;

	void method(String a, int b) {
		aString = a;
		aInt = b;

	}

	public IniObject(String aString, int aInt) {
		this.aString = aString;
		this.aInt = aInt;
	}

	public IniObject() {
	}

	public static void main(String[] args) {
		
		// Initializing the object with using a method
		IniObject object1 = new IniObject();
		object1.method("java", 8);
		System.out.println(object1.aString + " " + object1.aInt);
		
		// Initializing the object with using a constructor
		IniObject object2 = new IniObject("java", 11);
		System.out.println(object2.aString + " " + object2.aInt);
		
		// Initializing the object with directly accessing the fields
		IniObject object3 = new IniObject();
		object3.aString = "java";
		object3.aInt = 12;
		System.out.println(object3.aString + " " + object3.aInt);
	}

}
