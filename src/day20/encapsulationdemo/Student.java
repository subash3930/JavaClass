package day20.encapsulationdemo;

public class Student {
String stuName;
int roll;
//public Student(String s,int r) {
//	this.stuName=s;
//	this.roll=r;}

// not valid
//public Student(String stuName,int roll) {
//	stuName=this.stuName;
//	roll=this.roll;}
// valid, can generate using right click and set constructor using field
public Student(String stuName,int roll) {
	this.stuName=stuName;
	this.roll=roll;
	
}
public void displayInfo() {
	System.out.println("student name is: "+stuName);
	System.out.println("Roll is: "+roll);
}

	public static void main(String[] args) {
		Student s1=new Student("ram",22);
		s1.displayInfo();

	}

}
