package day26.abastractandInterfacedemo;
// by default 
public /* abstract*/ interface InterfaceDemo1 {

	void m1();
	public void m2();// we cant write privavte or protected ,final for method becoz it is public by default
	public abstract void m3();// if we dont write public abstract by default it is.
	int a1=8;
	final int a2=8;
	static int a3=8;
	final static int a4=8;
	final public int a5=8;
	public int a6=8;
	public static int a7=8;
	public final static int a8=8;// interface variable by default final static public
	
//	public InterfaceDemo1() {
//		
//	}
}
