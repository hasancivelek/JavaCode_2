package Week6;




//we are trying to convert real life object to codes


public class Person {

	//what kind of attributes my person is gonna have
	String name;
	int height;
	double weight;
	int age ;
	String hairColor ;
	
	// behaviors of our person
	
	void laugh(){
		
	}
	
	void speak(){
		
	}
	
	void breathe(){
		
	}
	
	public Person(String name, int age,String hairColor) {

		this.name = name;
		this.age = age;
		this.hairColor=hairColor;
		
		System.out.println("3 parameter constructor");
	}

	public static void main(String[] args) {
		
Person object = new Person("hasan", 40,"black");
System.out.println(object.age+"\n"+object.name+"\n"+object.hairColor);
//object.name="zuhal";
//object.age=23;
//System.out.println(object.name);

	}

}
