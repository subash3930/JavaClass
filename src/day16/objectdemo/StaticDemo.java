package day16.objectdemo;

public class StaticDemo {
	// static variable
	static String studentname = "raju";
	// static method
	public static void greet(){
		System.out.println(" Good morning");
	}

	public static void main(String[]args) {
		System.out.println(studentname);
		greet();
	// for static variable we dont need to create object to access within class
		// but recommended using Class name, this can be outside class
		System.out.println(StaticDemo.studentname);
		StaticDemo.greet();
		
		
	}

}
