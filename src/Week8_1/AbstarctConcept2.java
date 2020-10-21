package Week8_1;

abstract class Shape {

	abstract float area();

}

class Square extends Shape {
	int side;

	public Square(int side) {
		this.side = side;
	}

	float area() {
		return side * side;
	}
}

class Cirle extends Shape {

	int radius;
	static final double pi = Math.PI;

	public Cirle(int radius) {
		this.radius = radius;

	}

	float area() {
		return (float) (radius * radius * pi);
	}

}

public class AbstarctConcept2 {

	public static void main(String[] args) {

		// Cirle cirle= new Cirle(9);
		// System.out.println(cirle.area());
	//  Upcasting
		//  SupClass		  SubClass object
		Shape shape = new Cirle(9);
		//refName
		System.out.println(shape.area());

		shape = new Square(9);
		System.out.println(shape.area());
		
	}

}
