package week11_1;
//this ex. demo. what kind o functianality does my lambda expression
interface FunctionalInterface{
	String message();
}
class Aclass implements FunctionalInterface{
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Hello";
	}
	
}
public class LambdaConcept1 {
	public static void main(String[] args) {
		
		FunctionalInterface reference = new FunctionalInterface() {
			@Override
			public String message() {
				// TODO Auto-generated method stub
				return "Hello From Anonymous Class";
			}
		};
		
		System.out.println(reference.message());
		
		
		// Lambda Expression
	// FIName				refName		PList	"Implementation "		
		FunctionalInterface reference1 = () -> ("Hello");
		System.out.println(reference1.message());
		
	}
	
	
}

