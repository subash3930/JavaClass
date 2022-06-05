package day27.polymorphismdemo;
// class and interface public and default
// public : world level access
// default: package level access
public class AccessModifierDemo {
	String defaultVar=" this is default variable";
	public String publicVar="this is public variable";
	protected String protectedVar=" this is protected variable";
	private String privateVar="This is private variable";
	void defaultMethod() {
		System.out.println("This is default method");
		
	}
	public void publicMethod() {
		System.out.println("This is public method");
		
	}
	private void privateMethod() {
		System.out.println("This is private method");
		
	}
	protected void protectedMethod() {
		System.out.println("This is protected method");	
	}
public AccessModifierDemo(){
	System.out.println("This is public constructor");	
	}
	AccessModifierDemo(int a){
		System.out.println("This is default constructor");	
		
	}
	protected AccessModifierDemo(int a,int b){
		System.out.println("This is protected constructor");	
		
	}
	private AccessModifierDemo(int a,int b, int c){
		System.out.println("This is private constructor");	
		
	}
	public static void main(String[]args) {
		 AccessModifierDemo ob =new  AccessModifierDemo(4,5,6);
		 ob.defaultMethod();
		 ob.protectedMethod();
		 ob.privateMethod();
		 ob.publicMethod();
		 }
}
