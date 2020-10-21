package Week8_Lab;


public abstract class Car {
	
	private int weight;
	private String color;
	private String model;
	
	abstract  int fuelPerHour();
	
	public Car() {
		
	}

	public int getWeight(){
	return weight;
		
	}
	public void setWeight(int weight){
	this.weight=weight;
	}
	
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color=color;
	}
public String getModel(){
	return model;
}
public void SetModel(String model){
	this.model=model;
	
}
}
