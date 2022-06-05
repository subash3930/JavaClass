package day25.Inheritancedemo;

public class Sub extends Super {
public Sub() {
	super(5);
	System.out.println("Child default constructor");
}
public Sub(int a) {
	super(5);
	System.out.println("Child parameterized constructor");
}
}
