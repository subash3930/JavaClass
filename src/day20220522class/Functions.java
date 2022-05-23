package day20220522class;

import java.util.Scanner;

public class Functions {
	public static void Area() {
		Scanner input = new Scanner(System.in);
		System.out.println(" Time to calculate area of triangle:");
		System.out.println(" Enter a:");
		float a = input.nextFloat();
		System.out.println(" Enter b:");
		float b = input.nextFloat();
		System.out.println(" Enter c:");
		float c = input.nextFloat();
		double s=(a+b+c)/2;
		double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println(" The area is:"+area+" Sf");
	}
		
		public static void Multable() {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the Number for table");
			int n = input.nextInt();
			System.out.println("The table for "+n+" is below");
			for(int i=1;i<=10;i++) {
				
				System.out.println(" "+n+"*"+i+" = "+(i*n));
				
			}
		

	}

	

	}

