package Week9;

//this example demo static and default methods in interfaces

interface Iinterface2{
	
	//not all the methods needs to be abstract in interface(after java 8)
	  static void method1(){
		System.out.println("static method in interface");
	}
	 default void method2(){
		System.out.println("this is the default method2");
	}
	abstract void method3();
}

public class InterfaceConcept5 implements Iinterface2 {

	
	
	public static void main(String[] args) {
		
Iinterface2.method1();

Iinterface2 object = new InterfaceConcept5();

object.method2();
object.method3();
	}

	@Override
	public void method3() {
		System.out.println("hasan");
		
	}

	

}
