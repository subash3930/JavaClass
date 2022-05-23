package day19.constructordemo;

public class Student {
	// constructor overloading
	// same name with class
	// done by parameter number,type and sequence
	int roll;// if no value provided, complier set default value
	String username;//if no value provided, complier set default value
	// for class type variable default value is Null.
	public Student () {
	System.out.println("1. default constructor");	
	}
	public Student(int r) {
		System.out.println("2. parameterized constructor intr");
	}
	public Student(String r) {
		System.out.println("3. parameterized constructor string r");
	}
	public Student(String s,int r) {
		username = s;
		roll=r;
		
		System.out.println("4. parameterized constructor int r and string S");
	}
	public void displayInfo() {
		System.out.println("The student name is:"+username);
		System.out.println("The roll number is :"+roll);
	}
	
	

	public static void main(String[] args) {
	Student ram = new Student();
	Student hari = new Student(2);
	Student st = new Student("ram",1);
	st.displayInfo();
	
	

	}

}
