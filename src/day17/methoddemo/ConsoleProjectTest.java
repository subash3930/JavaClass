package day17.methoddemo;

import java.util.Scanner;

public class ConsoleProjectTest {

	public static void main(String[] args) {
		ConsoleProject project = new ConsoleProject();
		Scanner input =new Scanner(System.in);
		String decision ="";
		do {
			System.out.println("Enter the operation info|evenodd|factorial:");
			String operation = input.next();
		switch(operation) {
		case"info":
			System.out.println("Enter the name:");
			String name = input.next();
			System.out.println("Enter the age:");
			int age = input.nextInt();
			System.out.println("Enter the salary:");
			double salary = input.nextDouble();
			System.out.println("Enter the Eligibility:");
			boolean isEligible = input.nextBoolean();
			project.displayInfo(name, age, salary, isEligible);
			break;
		case"evenodd":
			System.out.println("Enter the n:");
			int n = input.nextInt();
			project.findEvenOdd(n);
			break;
		case"factorial":
			System.out.println("Enter the number:");
			int num = input.nextInt();
			int fact=project.factorial(num);
			System.out.println(fact);
			break;
			default:
				System.out.println("Wrong choice");
				break;
		}	
		System.out.println("Do you want to continue?Enter Y|N");
		decision = input.next();
		}while (decision.equalsIgnoreCase("Y"));
		System.out.println("bye bye");
			
		}

}

