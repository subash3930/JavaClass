package day26.abastractandInterfacedemo;

import day27.polymorphismdemo.AccessModifierDemo;

//import day27.polymorphismdemo.AccessModifierDemo; this other way
public class AccessModifierDemoChild extends day27.polymorphismdemo. AccessModifierDemo{
	public static void main(String[]args) {
		 AccessModifierDemo ob =new  AccessModifierDemo();
//		 ob.defaultMethod();
//		 ob.protectedMethod();
//		 ob.privateMethod();
		 ob.publicMethod();
		 AccessModifierDemoChild obj = new AccessModifierDemoChild();// can access by childs object 
		 //not the parent
		 obj.protectedMethod();
		 }
}

