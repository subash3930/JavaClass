package day10.conditionaldemo;

public class NestedIfElseDEmo {

	public static void main(String[] args) {
		int a = 90;
		int b = 100;
		int c = 85;
		if (a > b) {
			if (a > c) {
				System.out.println("a is largest one.");
			} else {
				System.out.println("c is largest one.");
			}
		} else {
			if (b > c) {
				System.out.println("b is largest one");

			} else
				System.out.println("a is largest one");
		}

	}
}
