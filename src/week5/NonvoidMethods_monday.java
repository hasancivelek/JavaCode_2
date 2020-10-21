package week5;

public class NonvoidMethods_monday {
//methods needs to be created inside of class
	//we can not create a method inside of an another method
	//non void method need to have return keywords
	public static void main(String[] args) {
	
		NonvoidMethods_monday object=new NonvoidMethods_monday();
         
		System.out.println(object.addition(9, 8));
		int calculation=object.addition(9, 8);
		System.out.println(calculation);
		System.out.println(object.printOut("hasan civelek"));
		String sentence=object.printOut("zuhal civelek");
		System.out.println(sentence);
		System.out.println(object.doubleMethod((byte)4, "hasan"));
		System.out.println(object.method(2));
		//how to call method with anonymous object
		//optional example
		System.out.println(new NonvoidMethods_monday().method(1));
		System.out.println(object.doubleMethod((byte)2, "ihsan"));
	}

	
	int addition(int a,int b){
		
		return a+b; //int values
	}
	String printOut(String string){
		return string +"!";
	}
	//return value needs to match with methods return type
	double doubleMethod(byte a , String name){
		System.out.println(name + a);
		return 5.0;
	}
	String method(int i){
		if(i==1){
			return"first";
		}
		else if(i==2){
			return "second";
		}
		else{
			return"not first or second";
		}
	}
}
