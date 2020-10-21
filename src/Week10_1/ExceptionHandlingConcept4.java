package Week10_1;

import java.awt.image.ImagingOpException;
import java.io.IOException;

//Two ways to handle exception
//1) Try catch, 
//2) add throws declaration (prevents compilation error)

public class ExceptionHandlingConcept4 {

	
	// throws keyword : Declares that method throws exception
	static void method() throws IOException{
		
		// throw keyword throws exception (artificial exception)
		throw new IOException();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
try {
	method();
} 
catch (IOException e) {
	
System.out.println("expection handled");

}

System.out.println("hi");

Thread.sleep(4000);
 
System.out.println("hi again");
	}

}
