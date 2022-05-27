package day24.arraydemo;

import java.util.Scanner;

public class ArrayDemo6 {

	public static void main(String[] args) {
		final int rows=3;
		final int columns =3;
		int [][]arr=new int[rows][columns];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.println("Enter the elements:");
				arr[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		

	}

}
