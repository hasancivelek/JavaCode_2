package Week7_1;

import java.awt.geom.Area;

//overriding : overriding provide us specific implementation for methods in sub classes and super classes
//final, static , private method can not be overridden

//overridden method must have the same return type

//Difference between overloading and overriding
//overloading; method will have different method signature,methods have to be in same class
//overriding methods will have same method signature,method have to be in different classes

class Shape {
	void findArea() {
		System.out.println("******************");
		System.out.println("Finding the area");
		//System.out.println("******************");
	}
}

class Rectangle extends Shape {
	int width;
	int length;

	// in order to call it overriding methods needs to be inherited
	void findArea() {// overriding the findArea Method
		super.findArea();// super key words acts as reference for super class
							// object

		// System.out.println("Finding the area in Rectangle Class");
		System.out.println("Rectangle area is : " + "width * length : " + width * length);
	}
}

// constructor can not be final//onemli final access modifier
// if method would be final, it can not be overridden //onemli
class Circle extends Shape {
	int radius;
	double pi = Math.PI;

	void findArea() {
		super.findArea();

		System.out.println("Area of the circle is : " + (int) (pi * Math.pow(radius, 2)));
	}

}

class Square extends Shape {
	int side;

	void findArea() {
		super.findArea();
		System.out.println("Area of the square is : " + side * side);
	}
}

public class OverridingConcept {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle();
		rectangle1.width = 10;
		rectangle1.length = 9;
		rectangle1.findArea();
		Circle circle1 = new Circle();
		circle1.radius = 10;
		circle1.findArea();
		Square square1 = new Square();
		square1.side = 8;
		square1.findArea();

	}

}
