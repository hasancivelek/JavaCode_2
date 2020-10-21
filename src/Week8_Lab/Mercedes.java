package Week8_Lab;

public class Mercedes extends Car {
	
	private int door;
	
	public Mercedes() {
		
	}
	public int getDoor(){
		return 2;
	}
	public void setDoor(int door){
		this.door=door;
	}
	@Override
	int fuelPerHour() {
		
		return 4;
	}

}
