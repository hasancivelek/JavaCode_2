package Week7_1;

//Final keywords;
//final variable =we can not up date the variable.
//final method=we can not override method.
//final class = we can not extend to this class.
//constructors can not be final. 
class SuperClass {
	int num = 4298;
	String name = "hasan";
}

class ChildClass extends SuperClass {
	int num = 4300;

	void printNumber() {
		// super class
		System.out.println(num);// 4300
		System.out.println(new SuperClass().num);// 4298
		System.out.println(super.num);// 4298
		System.out.println(this.num);// 4300 childclass
		//System.out.println(new ChildClass().name);//hasan
		System.out.println(new ChildClass().num);// 4300
	}
}

public class SuperKeywordConcept2 {

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		// new ChildClass().printNumber();//same
		childClass.printNumber();// same

	}

}
