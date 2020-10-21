package week_11Recap;



@FunctionalInterface
interface Formula{
	
	double calculate(int a);
	
	
	default double sqrt(int a){
		return Math.sqrt(a);
		
	}
}

class Hasan{
	static void sayHasan(){
		
		System.out.println("hasan");
		}	
}

public class Test {
	
	static void say(Formula formula){
		System.out.println("hello");
		
	}
	

	public static void main(String[] args) {
		Formula formula= new Formula() {
			
			@Override
			public double calculate(int a) {
				
				return a*10;
			}
		};
	//	System.out.println(formula.calculate(20));
	//	System.out.println(formula.sqrt(4));
		
		say(new Formula() {
			
			@Override
			public double calculate(int a) {
				
				return 0;
			}
		});
		
	
	}
	
}
		