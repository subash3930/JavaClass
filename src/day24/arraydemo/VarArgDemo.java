package day24.arraydemo;

public class VarArgDemo {
	public void printArray(int...ar) {// no double var arg, has to be at end
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}}
	

	public static void main(String[] args) {
		int[]ar= {3,4,5};
		VarArgDemo ob=new VarArgDemo();
		ob.printArray(ar);
		System.out.println("=====");
		ob.printArray(4,5,6,7);
		

	}}


