package week5;

public class method_1 {

	public static void main(String[] args) {
		
		method_1 object = new method_1();
		
		// Argument : Value that we use to pass to methods
		// Argument data type needs match with parameter data type
		object.printOut("Ahmet Can Turk");
		// Order of the arguments need to match with order of the parameters
		
		object.addNumbers(5, 9,"String");
		object.areaOfTriangle(5,3);
		
		int [] myArray = {1,2,3,4,5};
		int [] myArray2 = {1,2,3,4,5,8,7,6,5,4,3,3,2};
		object.printArray(myArray);
		System.out.println();
		object.printArray(myArray2);
	
		String [] myStringArray = {"Java", "Selenium", "TestNG"};
		System.out.println();
		object.printArray(myStringArray);
		//Void_monday obj= new Void_monday(); //baska class dan cagirma methodu
		//obj.age(1977);
	}
	//Overloading
	void printArray(String array[]){
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[i]+" ");
		
		}
	}
	void printArray(int  array []){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	
	void areaOfTriangle(int height, int base){
		// This method can calculate area of the triangle as long as height and base
		// will be provided
		double area = height * base / 2d;//((double)height * base) / 2;
		System.out.println(area);
	}
	
	public void addNumbers(int a, int b, String name){
		System.out.println(a + b);
		System.out.println(name);
	} 
	
	public void printOut(String print){
		System.out.println(print);
		System.out.println("Java instructor is "+ print);
	}
	
	
}