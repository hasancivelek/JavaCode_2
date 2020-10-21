package Week6;
//Classes are templates or blueprints for the objects

//objects are instances of their classes
public class Car {
//attributes
	String brand;
	int price;
	
	void buy(){
		System.out.println("total cost : "   +   brand + price);
	}
	
	public static void main(String[] args) {
		
//Class name objects name =new Class name():
		Car object1= new Car();
		object1.brand="Mercedes";
		object1.price=30000;
		System.out.println(object1.brand+ "\n"+object1.price);
Car object2=new Car();
		object2.brand="BMW";
		object2.price=40000;
		
		System.out.println(object2.brand+ "\n"+object2.price);
		
		object1.buy();
		object2.buy();
		
		
		
		Car object3=new Car();
		object3.brand=null;
		object3.price=0;
		
		  object3.buy();
	}

}
