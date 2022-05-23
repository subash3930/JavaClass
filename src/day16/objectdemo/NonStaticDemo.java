package day16.objectdemo;

public class NonStaticDemo {
	// non static instance variable.
	String name ="ram";
	// non static method
	public void sayHello() {
		System.out.println("Hello...");
	}

	public static void main(String[] args) {
		// Need main method to print.
		// To run class JVM needs main method
		// object needs to create to call variable 
		// and function on class from main and other class.
		NonStaticDemo obj=new NonStaticDemo();
		System.out.println("Main");
		System.out.println(obj.name);
		obj.sayHello();
	
		
		}

	}


