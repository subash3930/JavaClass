package day23.arraydemo;

public class ArrayDemo5 {

	public static void main(String[] args) {
		final int rows=3;
		final int columns =3;
		int[][] arr= new int [rows][columns];
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		
		System.out.println("=============");
		
		arr[0][0]=12;
		arr[0][1]=12;
		arr[0][2]=12;
		
		arr[1][0]=12;
		arr[1][1]=12;
		arr[1][2]=12;
		
		arr[2][0]=12;
		arr[2][1]=12;
		arr[2][2]=12;
		System.out.print(arr[0][0]);
		System.out.print(arr[0][1]);
		System.out.println(arr[0][2]);
		
		System.out.print(arr[1][0]+" ");
		System.out.print(arr[1][1]+" ");
		System.out.println(arr[1][2]+" ");
		
		System.out.print(arr[2][0]+" ");
		System.out.print(arr[2][1]+" ");
		System.out.println(arr[2][2]+" ");
		
		
		
	}
	

}
