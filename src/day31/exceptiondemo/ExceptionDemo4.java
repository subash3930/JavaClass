package day31.exceptiondemo;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		try {
			// nested is allowed as many as need
			
		} catch (Exception e) {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}finally {
				try {
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
		}

	}

}
