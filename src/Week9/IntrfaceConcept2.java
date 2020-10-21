package Week9;

interface IMoveable {
	int AVG_SPEED = 60;// static public and final by default

	void moveForward();

	void moveBackward();
}

 class Animal implements IMoveable {

	@Override
	public void moveForward() {
		System.out.println("animal moved foreward");

	}

	@Override
	public void moveBackward() {

		System.out.println("animal moved backward");
	}

}

class Vehicle implements IMoveable  {
	// overriden method public
	public void moveForward() {
		System.out.println("vehicle moved forward");

	}

	public void moveBackward() {
		System.out.println("vehicle moved backward");

	}
}

public class IntrfaceConcept2 {

	public static void main(String[] args) {
		// up casting
		IMoveable vehicle1 = new Vehicle();
		
		System.out.println(IMoveable.AVG_SPEED);
		vehicle1.moveBackward();
		vehicle1.moveForward();

		vehicle1 = new Animal();
		vehicle1.moveBackward();
		vehicle1.moveForward();

	}

}
