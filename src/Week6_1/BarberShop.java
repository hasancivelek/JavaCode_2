package Week6_1;
//task:creta a class which finds how many customer this barber shop has?
public class BarberShop {

	static int numberOfcustomer;
	String customerName;
	
	
	public BarberShop(){
		numberOfcustomer++;
}
	public BarberShop(String a){
		customerName=a;
		numberOfcustomer++;
		//System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
BarberShop customer1=new BarberShop();
BarberShop customer2=new BarberShop();
BarberShop customer3=new BarberShop();
BarberShop customer4=new BarberShop("Bob");

System.out.println(numberOfcustomer);
//System.out.println(customer4.customerName);

	}

}
