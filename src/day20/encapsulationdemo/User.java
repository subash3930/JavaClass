package day20.encapsulationdemo;
// binding data inside method on class.
// make variable private and setter and getter class 
//POJO= plain old java object

public class User {
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	


}
