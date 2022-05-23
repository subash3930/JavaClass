package day20220522class;

import java.util.Scanner;

public class ClassTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String decision ="";
		do
		{
		System.out.println("Enter the operation: Area||Multable");
		String operation = input.next();
		switch (operation) {
		case "Area":
			Functions.Area();
			break;
		case "Multable":
			Functions.Multable();
			break;
		default:
			System.out.println("Wrong Choice");
		}
		System.out.println("Would you like to continue? Press Y||N");
		decision = input.next();
		}while(decision.equalsIgnoreCase("Y"));

	}

}
