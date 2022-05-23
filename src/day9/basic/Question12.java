package day9.basic;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter name:");
		String name = input.nextLine();
		System.out.println(" Enter age:");
		int age = input.nextInt();
		System.out.println(" Enter nationality:");
		String nation = input.next();
		System.out.println("=============================");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Nationality: "+nation);
		System.out.println("=============================");
		input.close();
	}

}
