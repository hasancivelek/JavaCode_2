package Week7_Recap;
//this example demonstrates overriding and overloading
class Test{
	void method1(){
		System.out.println("this is test class");
	}
	void method1(int a){
		System.out.println("this is test class");
}
}

public class Example2 extends Test{
	
	
void method1(){
		
	System.out.println("this is example2 class");
	}

	public static void main(String[] args) {
		new Example2().method1();


	}

}
