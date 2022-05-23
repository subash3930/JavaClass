package day18.constructordemo;

public class User {
	String username;// member data
	String password;// member data
	
	public User(String u,String p) {
		System.out.println("Constructor is called");
		username=u;
		password=p;
	// Constructor: special member method.
		// name is same as class, any access modifier
		// no return type
		// used to initialize member's data
		// Runs only once for each object and 
		//set unique value
		
		
	}
	public void getInfo(String u,String p) {
		username=u;
		password=p;	
	}
	public void displayInfo() {
	System.out.println("The usename is:"+username);	
	System.out.println("The password is:"+password);
	}
	public static void main(String[]args) {
		User santosh = new User("Santosh","abc@123");
	//	santosh.getInfo("Santosh","abc@123");
		santosh.displayInfo();
		User raju = new User ("Raju","bcd@234");
		//raju.getInfo("Raju", "bcd@234");
		raju.displayInfo();
	}

}
