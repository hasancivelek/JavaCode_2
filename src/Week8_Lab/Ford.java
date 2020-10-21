package Week8_Lab;

public class Ford extends Car{
	
	private int maxSpeed;
	
	public Ford() {
		
	}
	
	public int getMaxSpeed(){
		return maxSpeed;
		
	}
public void setMaxSpeed(int maxSpeed){
	this.maxSpeed=maxSpeed;
}
@Override
int fuelPerHour() {
	
	return 5;
}

}
