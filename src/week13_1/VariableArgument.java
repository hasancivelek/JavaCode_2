package week13_1;

public class VariableArgument {

	
	//create a method that can recive unlimited 
	
	static void method (int... a){
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		

method(1);
method(2,3);
	}

}
