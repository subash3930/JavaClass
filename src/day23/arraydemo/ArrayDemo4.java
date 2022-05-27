package day23.arraydemo;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int[]arr= new int[]{4,3,8};// to pass data dynamic
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}

	}
System.out.println(max);
}
}