package day32.exceptiondemo;

public class InvalidAgeException extends RuntimeException {
	private static final long serialVersionUID = 6155361620669143650L;
	
public InvalidAgeException(String msg) {
	super(msg);
	
}
}
