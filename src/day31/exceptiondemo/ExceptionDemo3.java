package day31.exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number1:");
		int a =input.nextInt();
		System.out.println("Enter number2:");
		
		try {
			System.out.println("Inside try start");
			int b =input.nextInt();
			System.out.println("Div is: "+divide(a,b));
			System.out.println("Inside try end");
		}catch(ArithmeticException div0) {
		System.out.println("Inside catch");	
		}finally {
			// finally always runs
			System.out.println("inside finally");
			input.close();// for resource release
		}
		System.out.println("==end===");
		
	}
	public static int divide(int num1,int num2) {
		int div =num1/num2;
		return div;
	}
}
