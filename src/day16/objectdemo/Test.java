package day16.objectdemo;

public class Test {

	public static void main(String[] args) {
		NonStaticDemo obj = new NonStaticDemo();
		System.out.println(obj.name);
		obj.sayHello();
		System.out.println(StaticDemo.studentname);
		StaticDemo.greet();
		// static called using class name
		// non static called using obj 

	}

}
