package day32.exceptiondemo;
import java.util.InputMismatchException;

import java.util.Scanner;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[]arr=new int[2];
		
		
		try {System.out.println("Enter number1:");
		int a =input.nextInt();
		System.out.println("Enter number2:");
			int b =input.nextInt();
			arr[2] = divide(a,b);
	//		System.out.println("Div is: "+divide(a,b));
			
		}catch(ArithmeticException ae) {
		System.out.println(ae);	
		}catch(Exception e) {// for multilevel catch, parent should be in the last.
			System.out.println(e);
		}
		System.out.println("==end===");
		
	}
	public static int divide(int num1,int num2) {
		int div =num1/num2;
		return div;
	}

}
