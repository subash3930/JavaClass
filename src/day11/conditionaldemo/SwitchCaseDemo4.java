package day11.conditionaldemo;

import java.util.Scanner;

public class SwitchCaseDemo4 {

	public static void main(String[] args) {
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

}
}
