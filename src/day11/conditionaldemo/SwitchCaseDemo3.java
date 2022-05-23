package day11.conditionaldemo;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the choice");
		String operator = input.next();
	
		switch (operator) {
		case "add":
			System.out.println("This is Addition");
			break;

		case "sub":
			System.out.println("This is substraction");
			break;

		case "mul":
			System.out.println("This is Multipication");
			break;

		case "div":
			System.out.println("This is Division");
			break;

		default:
			System.out.println(" wrong Choice");

	}

}
}
