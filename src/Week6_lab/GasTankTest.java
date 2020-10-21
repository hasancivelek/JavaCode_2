package Week6_lab;
//repl it question lab 2
public class GasTankTest {

	public static void main(String[] args) {
		
GasTank object= new GasTank(50);

	
	System.out.println(object.capacity);
	System.out.println(object.isEmpty());
	object.addGas(60);
	System.out.println(object.isEmpty());
	System.out.println(object.amount);
	}

}
