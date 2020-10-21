package Week6;
//this example demonstrates constructor concept
//instantiation creating object
public class CellPhone {

	//fields
	String brand;
	String color;
	int price;
	//constructor it is a special block with instantiate the object
	//constructors consist of access modifiers and Class name
	//accessModifiers Class name (parameter List)
	// if we do not  create a constructor , java creates a default one with no parameter
	
	
	public CellPhone(String a ,String c , int b){
		brand=a;
		color=c;
		price=b;
		//System.out.println(a+" "+c+" "+b);
	}
	
	//default
	
	public CellPhone(){
		
}
	
	
	
	
	public static void main(String[] args) {
		
		//Class name reference     Constructor
		CellPhone object1 =new CellPhone("Apple","white" ,1000);
		System.out.println(object1.brand+ "\n"+object1.color+"\n" +object1.price);
		
System.out.println("*****************************");
		CellPhone object2 =new CellPhone();
		//object2.brand="Samsung";
		//object2.color="Black";
		//object2.price=235;
		System.out.println(object2.brand+ "\n"+object2.color+"\n" +object2.price);
	}

}
