package day11.conditionaldemo;

public class ElseIfDemo {

	public static void main(String[] args) {
		int marks = 91;
		// bitwise&|
		if (marks >= 80 && marks <= 100) {
			System.out.println("Distinction");
		} else if (marks >= 60 && marks <= 79) {
			System.out.println("First");
		} else if (marks >= 60 && marks <= 59) {
			System.out.println("second");
		} else if (marks >= 60 && marks <= 79) {
			System.out.println("First");
		} else {
			System.out.println("fail");

		}
		System.out.println("exit");
	}

}
