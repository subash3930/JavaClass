package day11.conditionaldemo;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
	int a=0,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the choice");
		char operator = input.next().charAt(0);
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
			System.out.println("Enter a");
			a = input.nextInt();
			System.out.println("Enter b");
			b = input.nextInt();
		}

		switch (operator) {
		case '+':
			System.out.println("This is Addition");
			int sum = a + b;
			System.out.println("addition " + sum);
			break;

		case '-':
			System.out.println("This is substraction");
			int sub = a - b;
			System.out.println("Substraction " + sub);
			break;

		case '*':
			System.out.println("This is Multipication");
			int mul = a * b;
			System.out.println("Multipication " + mul);
			break;

		case '/':
			System.out.println("This is Division");
			int div = a / b;
			System.out.println("division " + div);
			break;

		default:
			System.out.println(" wrong Choice");

		}

		System.out.println("exit");
		input.close();
	}
}
