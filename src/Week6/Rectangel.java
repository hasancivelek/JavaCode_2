package Week6;

public class Rectangel {
	// attributes
	int length;
	int width;
	// int area;
	// int perimeter ;
	// methods

	void calculateArea() {
		System.out.println("Area of the rectangle is :" + length * width);
	}

	void calculatePerimeter() {
		System.out.println("Perimeter of the rectangle is : " + (2 * (length + width)));
	}

	public static void main(String[] args) {

		Rectangel object1 = new Rectangel();
		object1.length = 5;
		object1.width = 10;
		object1.calculateArea();
		object1.calculatePerimeter();

		Rectangel object2 = new Rectangel();
		object2.length = 22;
		object2.width = 12;
		object2.calculateArea();
		object2.calculatePerimeter();
	}

}
