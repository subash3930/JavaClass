package day23.arraydemo;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[]arr= {4,3,8};// array literal
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println("Sum of an array elements is:"+sum);
	}

}
