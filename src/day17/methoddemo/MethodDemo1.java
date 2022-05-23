package day17.methoddemo;

public class MethodDemo1 {
// Access modifier void Method name(any type and any number parameter){
// block of code
	//}
	// Access modifier : public, private, protected or default.
	// if nothing it will be default.
	 public void displayInfo(String name, int age,double salary, boolean isEligible) {
	// order,number and type should be same as declaration for calling  	
		 System.out.println("Name is:"+name);
		 System.out.println(" Age is:"+ age);
		 System.out.println("Salary is:"+salary);
		 System.out.println("Eligibility"+isEligible);
		 
	 }
	// Method Definition with no parameter
	public void sayHello() {
		System.out.println("Hello Hello Hello....");
	}
	public static void main(String[] args) {
		System.out.println("Main start");
		// method calling
		// Class name object = new class name()
		MethodDemo1 obj = new MethodDemo1();
		obj.sayHello();
		String n = "sare";
		int a = 29;
		Double s = 100000.0;
		Boolean e = true;
		System.out.println("====================");
		obj.displayInfo(n, a, s, true);
		// can have any variable name(better same) but type should be same.
		System.out.println("========================");
		obj.displayInfo("Hari",29, 100000, true);
		System.out.println("====================");
		// can send directly
		System.out.println("Main End");
	}
   
}
