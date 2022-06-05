package day26.abastractandInterfacedemo;
// we can not inherit final class
public/*final*/ class FinalDemo {
	int a; // final variable must initialized at time of declaration and cant chage
	final int c=6;//final is used to make constant.
	public/*final*/ void greet() {
		System.out.println("hello,good morning....");
	}
//	final int b;
	// we can not use final on constructor
//public/*final*/ FinalDemo(int b) {
//	this.b=5;
//	
//}
}
