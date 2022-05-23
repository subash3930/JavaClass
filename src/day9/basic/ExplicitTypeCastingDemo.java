package day9.basic;

public class ExplicitTypeCastingDemo {

	public static void main(String[] args) {
		double d = 123.45;
		float f =(float)d;
		long l = (long)f;
		int i = (int)l;
		short s = (short)i;
		byte b =(byte)s;
		// value truncate
		// depends on application sensitivity.
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(s);
		System.out.println(b);
		
		

	}

}
