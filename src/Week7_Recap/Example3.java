package Week7_Recap;
//this and super keyword for invoking constructor 

//if our superclass has constructors, one of the superclass constructor needs to be invoked
//when we are creating subclass object

class class1 {
	public class1(int a) {
		System.out.println("int patrameter constructors");
	}

	public class1(double a) {
	   this(9);// this statement invokes int parameter cons.
		System.out.println("double parameter constructors");

	}

}

public class Example3 extends class1 {

	public Example3() {
		super(4.0);// this statement invokes double parameter constructor
	
	}

	public static void main(String[] args) {
		//Example3 obj=new Example3();
		new Example3();
	}

}
