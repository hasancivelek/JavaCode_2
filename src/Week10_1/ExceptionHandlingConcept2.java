package Week10_1;

public class ExceptionHandlingConcept2 {

	public static void main(String[] args) {
		// in the try block, if we face with any exception,
		// the other statements after exception thrower statement
		// will not be executed
		try {
			int arr[] = { 4298, 4299 };
		 System.out.println(arr[3]);   //ArrayIndexOutOfBoundsException

			//System.out.println(10 / 0);      // AritmeticException

		}
		// in the catch blocks, superclass parametered catch block
		// can not be before subclass parametered catch block
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("ArrayIndexOutOfBoundsException 1");
		} 
		catch (ArithmeticException e) {

			System.out.println("ArithmeticException 2");

		} 
		catch (Exception e) {

			System.out.println("3");
		}
		System.out.println("hi");
		System.out.println("silicone labs");

	}

}
