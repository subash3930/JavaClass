package day26.abastractandInterfacedemo;

public class ShapeTest {

	public static void main(String[] args) {
	Shape shape;
	// we cant create object of an abstract class
	// we can create reference variable of abstract class.
	shape =new Rectangle();
	shape.draw();
	System.out.println("========");
	shape= new Triangle();
	shape.draw();
	
	

	}

}
