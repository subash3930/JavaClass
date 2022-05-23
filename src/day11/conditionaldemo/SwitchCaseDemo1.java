package day11.conditionaldemo;

import java.util.Scanner;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		// Menu driving Case
		// Case can be unlated, break is not mandatory
		// After java seven, diffrent symbol can be used for switch
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the choice");
		int n = input.nextInt();
		switch (n) {
		case 1:
			System.out.println("This is Addition");
			break;

		case 2:
			System.out.println("This is substraction");
			break;

		case 3:
			System.out.println("This is Multipication");
			break;

		case 4:
			System.out.println("This is Division");
			break;

		default:
			System.out.println(" wrong Choice");

		}

		System.out.println("exit");
		input.close();
	}

}
