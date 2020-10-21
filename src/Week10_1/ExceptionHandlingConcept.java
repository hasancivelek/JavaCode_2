package Week10_1;

import java.util.Scanner;

public class ExceptionHandlingConcept {
	
	// Exception : Error events which can occur during execution time, 
	// it can disrupts the flow of the program
	
	public static void main(String[] args) {
	// try-catch	
  
		try {
	
			System.out.println(9/0);// undefined
			} 
		catch (ArithmeticException e ){            //RuntimeException or it is superclass
	
	// Parameter can be changed into
	// ArithmeticException or it's superclasses
	//e.printStackTrace();
	
			System.out.println("undefind");
}

   System.out.println("hello word");
   
   
   //	System.out.println("hello word");	
//	
	
//	int[]arr ={0}	;
//	arr[4]=0;
//		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("input your age");
//		int age = scanner.nextInt();
		

	}

}
