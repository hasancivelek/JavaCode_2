package week5;
// Access modifiers .java is a source file
//we can call methods from another classes or packages in our project
//in order to call some other classes non - static method
//you need to create object for that class



public class Access_1 {

	public static void main(String[] args) {
		
		SecondClass secondClass = new SecondClass();
		secondClass.method1();
		
		//if my static method in the different class , we need to use Classname.method();
		SecondClass.method2();
		
		//SecondClass.method3(); compiler error private method
		 SecondClass.method4();

	}

}
// public methods accessible from anywhere in the project
//default method are accessible from only the same package
//private method are accessible from only the    same class
class SecondClass{
       void method1(){//access modifier default
		//non static method
		//when we want to call this method, we need to create object
		System.out.println("this is method1");
		
	
}
	static void method2(){//access modifier default
		//static method in order to call this method from another class
		//we need to use the class name
		System.out.println("this is method2");
	}
	
	private static void method3(){    //access modifier is private
		System.out.println("this is method3");

	}
	public static void method4(){
		System.out.println("this is method4");
	}
	
	
}







