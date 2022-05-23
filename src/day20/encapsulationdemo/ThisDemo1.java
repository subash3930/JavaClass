package day20.encapsulationdemo;
// Shadowing is the process of hiding instance variable by local
// variable inside non-static method or constructor of class.
// this: is a keyword and is an implicit reference variable of current object
// and current type. 'this' is available only inside non-static methond and constructor of class
// 'this' is final variable. means value cant change.
// 'this' can not be used on static method.
public class ThisDemo1 {
// instance variable
	int a= 5;
	public void printData() {
		System.out.println("This is:"+this);
		System.out.println(a);
		// local variable
		int a =6;
		System.out.println(a);
	//	ThisDemo1 obj1 = new ThisDemo1();
		int sum = a+ this.a;
		System.out.println("sum is:"+sum);
	}
	//public static void m() {
	//	ThisDemo1 ob =new ThisDemo1();
	//	System.out.println(ob.a);
	//	int a= 6;
	//	System.out.println(a);
	//}
	public static void main(String[] args) {
	ThisDemo1 obj1= new ThisDemo1();
	System.out.println("obj1 is:"+obj1);
	obj1.printData();
		System.out.println("===========");
		ThisDemo1 obj2 = new ThisDemo1();
		System.out.println("obj2 is:"+obj2);
		obj2.printData();
	}

}
