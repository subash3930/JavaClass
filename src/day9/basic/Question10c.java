package day9.basic;

import java.util.Scanner;

public class Question10c {

	public static void main(String[] args) {
		// NaN: Non applicable Number

		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a:");
		float a = input.nextFloat();
		System.out.println(" Enter b:");
		float b = input.nextFloat();
		System.out.println(" Enter c:");
		float c = input.nextFloat();
		double x= (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		System.out.println(" The value of is:"+x);
		input.close();
	}

}
