package Week10_1;

import java.util.Scanner;

public class ExceptionHandlingConcept6 {

	static int inputNumerator(Scanner scanner){
		
		System.out.println("input numarator:");
		
		return scanner.nextInt();
	}
static int inputDenominator(Scanner scanner){
		
		System.out.println("input denominator:");
		
		return scanner.nextInt();
	}
	static void divide (int a ,int b) throws RuntimeException{
		System.out.println(a/b);
	}
	
	
	public static void main(String[] args) {
		// if our method has throws declaration for runtime (unchecked) exception
		// it will not give underlined warning where it has been called
Scanner scanner =new Scanner(System.in);

try {
	divide(inputNumerator(scanner), inputDenominator(scanner));
} catch (RuntimeException e) {
	
System.out.println("undefined");
}

	}

}
