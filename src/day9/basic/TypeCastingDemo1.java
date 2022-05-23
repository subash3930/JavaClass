package day9.basic;

public class TypeCastingDemo1 {

	public static void main(String[] args) {
		byte b =127;
		//implicit type casting(conversion), Use case : average coming from int.
		int i=b; // by java complier
		
		int ii=127;
		byte bb =(byte)ii;// explicit type Casting (Conversion) it is done by Programmer
		
		// byte- short - int -long-float-double , The order is implicit. other way is Explicit.
		
		
		short s=32767;
		double d =s;
		
		double dd =32765.65;
		short ss = (short)dd;
		
				

	}

}
