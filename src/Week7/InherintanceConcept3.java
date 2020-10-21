package Week7;
//this example demonstrates  multi level inheritance in java

class A {
	int a = 10;

	void a() {
		System.out.println("method a");
	}
}

class B extends A {
	int b = 11;

	void b() {
		System.out.println("method b");
	}
}

class C extends B {
	int c = 12;

	void c() {
		System.out.println("method c");
	}

}

public class InherintanceConcept3 {
	public static void main(String[] args) {

		C objectC = new C();
		System.out.println(objectC.a);
		System.out.println(objectC.b);
		System.out.println(objectC.c);
		objectC.a();
		objectC.b();
		objectC.c();

	}

}
