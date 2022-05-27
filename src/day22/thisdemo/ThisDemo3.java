package day22.thisdemo;

public class ThisDemo3 {
	public void sayHello() {
		System.out.println("Hello,good morning");
	}
	public void greet(ThisDemo3 o) {
		o.sayHello();
	}
	public void greeting() {
//		ThisDemo3 o = new ThisDemo3();
//		greet(o);
		greet(this);
	}

	public static void main(String[] args) {
		ThisDemo3 obj= new ThisDemo3();
		obj.greeting();

	}

}
