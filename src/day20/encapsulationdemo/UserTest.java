package day20.encapsulationdemo;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User();
		// set
		user1.setUsername("Santosh");
		user1.setPassword("pp1");
		// get
		System.out.println(user1.getUsername());
	}

}
