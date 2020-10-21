package Week7;
 
//Subclass will inherit all the properties(except private properties)from superclass
//inheritance only works in one way. 
//Properties will be inherited from superclass to subclass

//Single inheritance
class SuperClass {
	private int x;
	String yString="hasan";

	void SCMethod() {
		System.out.println("this is method in super class!");
		
	}

}

class SubClass extends SuperClass {
	int a;
	String b;

	void SUBmethod() {
		System.out.println("this is method in sub class!");
		
}
void SubMethod2(){
	System.out.println(a+"\n"+b+"\n"+yString);
	SCMethod();

}

}
//public classes needs their own file
public class InheritanceConcept1 {

	public static void main(String[] args) {

		SubClass subClass = new SubClass();
		subClass.a = 9;
		// subClass.x=9;//x is not reachable with subclass object
		//SuperClass superClass = new SuperClass();
	// superClass.SUBMethod();// SUBMethod is not reachable with superclass
	subClass.SubMethod2();
	subClass.SUBmethod();
	//subClass.SCMethod();
	

	}

}
