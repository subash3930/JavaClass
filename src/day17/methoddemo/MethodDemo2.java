package day17.methoddemo;

public class MethodDemo2 {
	// Access modifier <return type> Method name(){
	// block of code
	// return value matching with return type 
		//}
	
	public int addition() {
		int a=6;
		int b=5;
		int sum = a+b;
		return sum;
		// can return exact value
	}
	
	// Access modifier <return type> Method name(any type and any number parameter){
		// block of code
		// return value matching with return type 
			//}
	public String greet(String firstname,String location) {
		String msg ="Hello   "+firstname+"  from  "+location;
		return msg;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo2 obj=new MethodDemo2();
		int sum =obj.addition();
		System.out.println("Sum is:"+ sum);
		String firstname = "ram";
		String location = "Pokhara";
		String msg = obj.greet(firstname, location);
		System.out.println(msg);
		
	}

}
