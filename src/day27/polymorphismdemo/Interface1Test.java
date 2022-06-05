package day27.polymorphismdemo;

public class Interface1Test {

	public static void main(String[] args) {
		Interface1 ob =new Interface1Impl1();
		ob.greet();
		System.out.println(Interface1.a);
		
		ob =new Interface1Impl2();
		ob.greet();
		System.out.println(Interface1.a);
		
		Interface1Impl1 o =new Interface1Impl1();
		System.out.println(o.a);
	}

}
