package day32.exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[]arr=new int[2];
		
		
		try {System.out.println("Enter number1:");
		int a =input.nextInt();
		System.out.println("Enter number2:");
			int b =input.nextInt();
			int result = divide(a,b);
		// multiple catch	
		}catch(ArithmeticException | InputMismatchException ae) {// java seven we can,| is or
		System.out.println(ae);	
		}
		System.out.println("==end===");
		
	}
	public static int divide(int num1,int num2) {
		int div =num1/num2;
		return div;
	}

}
