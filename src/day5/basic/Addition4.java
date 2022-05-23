package day5.basic;

import java.util.Scanner;

public class Addition4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/* how to use shortcut ctrl shift and o 
		 need help?
		 
		 */
		System.out.println("Enter number1: ");
	    int number1= input.nextInt();
	    System.out.println("Enter number2: ");
	    int number2=input.nextInt();
		int sum = number1+number2;
		System.out.println("The sum of number1 and number2 is: "+sum);
		System.out.println("The sum of "+ number1+ " and "+ number2+" is: "+sum);
		
		int sub = number1-number2;
		System.out.println("The substraction of number1 and number2 is: "+sub);
		System.out.println("The substraction of "+ number1+ " and "+ number2+" is: "+sub);
		input.close();

	}

}
