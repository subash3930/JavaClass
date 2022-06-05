package day28.stringsdemo;

public class StringsDemo1 {
	public static void main(String[]args) {
		//Implicit creation(by using literal)
		String s1="Nepal";
		System.out.println(s1);
		//Explicit creation(by using constructor)
		String s2= new String();
		System.out.println(s2);
		String s3= new String("Hello");
		System.out.println(s3);
		
		char []ch= {'a','b','c'};
		String s4=new String(ch);
		System.out.println(s4);
		
		byte[]bb= {65,66,67};
		String s5=new String(bb);
		System.out.println(s5);
		
		
		
	}

}
