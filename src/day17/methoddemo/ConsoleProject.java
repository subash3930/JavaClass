package day17.methoddemo;

public class ConsoleProject {
	public void findEvenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println(n + " is even number");
		} else
			System.out.println(n + "is odd number");
	}

	public int factorial(int n) {
		
		if(n == 0) {
			return 0;
		}
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = i * fact;
		}
		return fact;
	}

	public void displayInfo(String name, int age, double salary, boolean isEligible) {
		System.out.println("Name is:" + name);
		System.out.println(" Age is:" + age);
		System.out.println("Salary is:" + salary);
		System.out.println("Eligibility" + isEligible);
	}
}
