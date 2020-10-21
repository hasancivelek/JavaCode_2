package Week8_1;


//This example demonstrates how abstract methods should be implemented
//If we have one abstract subclass and one concrete subclass
abstract class Class1{
	abstract void method1();
}
abstract class Class2 extends Class1{
	abstract void method2();
}
public class AbstractConcept4 extends Class2 {
	@Override
	void method1() {
		
		
	}
	@Override
	void method2() {
		
		
	}
}
