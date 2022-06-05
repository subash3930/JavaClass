package day25.Inheritancedemo;

public class Child extends Parent {
	String name ="I am child";
	public void greet() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println("hello,good morning from child");
		super.greet();
	}
	

}
