package day19.constructordemo;

public class DefaultValueDemo {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bb;
	char c;
	String str;
	Student stu;
	
	
	

	public static void main(String[] args) {
		 DefaultValueDemo ob = new DefaultValueDemo();
		 System.out.println(ob.b);
		 System.out.println(ob.s);
		 System.out.println(ob.i);
		 System.out.println(ob.f);
		 System.out.println(ob.d);
		 System.out.println(ob.bb);
		 System.out.println(ob.c);
		 System.out.println(ob.str);
		 System.out.println(ob.stu);
		 int a;// local variable there is no default value
		// System.out.println(a); 

	}

}
