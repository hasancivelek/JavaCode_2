package Week9;

interface IVehicle{
	
	void hasWheels();
	void hasEngine();
}
interface IMotorcycle extends IVehicle{
	void hasPedal();
	void hasHandleBars();
	
}

interface ICar extends IVehicle{
	
	boolean HasAirBags();
	boolean hasSunRoof();
	boolean hasDoors();
	
}



class Toyota implements ICar{

	@Override
	public void hasWheels() {
		
		
	}

	@Override
	public void hasEngine() {
		
	}

	@Override
	public boolean HasAirBags() {
		

		return false;
	}

	@Override
	public boolean hasSunRoof() {
		
		return false;
	}

	@Override
	public boolean hasDoors() {
		
		return false;
	}
	
}


class Kawasaki implements IMotorcycle{

	@Override
	public void hasWheels() {
		
System.out.println("motorcycle are 2 wheels");
		
	}

	@Override
	public void hasEngine() {
		

		
	}

	@Override
	public void hasPedal() {
		

		
	}

	@Override
	public void hasHandleBars() {
		

		
	}
	
	
	
}





public class InterfaceConcept3 {

	public static void main(String[] args) {
		
		

	}

}
