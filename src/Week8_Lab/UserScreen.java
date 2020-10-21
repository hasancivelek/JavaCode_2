package Week8_Lab;

public class UserScreen {

	public UserScreen() {
		
	}
	public void show(Car car){
		
		System.out.println("Weight :" +car.getWeight());
		System.out.println("Model: "+ car.getModel());
		System.out.println("Color :"+ car.getColor());
		System.out.println("Fuel Per Hour: "+ car.fuelPerHour());
		
		Mercedes obj =new Mercedes();	
		obj.setDoor(2);
		System.out.println("Merceds Door: "+obj.getDoor());
		
		Ford obj1 = new Ford();
		obj1.setMaxSpeed(250);
		System.out.println("Ford Max Speed:"+obj1.getMaxSpeed());
		
	}

}
