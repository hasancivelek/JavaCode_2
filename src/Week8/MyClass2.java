package Week8;


public class MyClass2 {
	// static variable are class level variable
	// non static variable are object level variables
	static int a;//class level
	int b;//object level

	static void method() {
		//b++;
	}

	public static void main(String[] args) {

		//MyClass2.method();
	
		
		MyClass2 object1 = new MyClass2();
		object1.a = 9;
		object1.b = 8;

		MyClass2 object2 = new MyClass2();
		object2.a = 99;
	     object2.b = 88;
		System.out.println(object1.a);// 99
		System.out.println(object2.a);// 99
		System.out.println(object1.b);// 8
		System.out.println(object2.b);// 88
	
	}

}
