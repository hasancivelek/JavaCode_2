package Week8_Lab;



public class AbstractTester3 {

	public static void main(String[] args) {
		Car ford =new Ford();
		ford.setWeight(1500);
		ford.SetModel("Fiesta");
		ford.setColor("Black");
		
		
		Car mercedes = new Mercedes();
		mercedes.setColor("Pearl");
		mercedes.SetModel("E-200");
		mercedes.setWeight(3500);
		
		
		
		UserScreen screen =new UserScreen();
		screen.show(ford);
		//screen.show(mercedes);
		


	}

}
