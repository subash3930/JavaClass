package day24.arraydemo;

public class ForEachDemo1 {

	public static void main(String[] args) {
		int []a={3,4,5};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("============Enhanced for loop=====");
		
		for(int b:a) {
			System.out.println(b);
		}
		

	

}}
