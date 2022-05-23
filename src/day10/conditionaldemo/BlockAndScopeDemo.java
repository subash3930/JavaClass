package day10.conditionaldemo;

public class BlockAndScopeDemo {// Class block

	public static void main(String[] args) {// main method block
		
		int b=5;// instance variable
		// block = {=====} starts with{ and ends with }
		//block maintains/provide scope.
		// variable can accessed below the 
		// inernal (inner block ) can not accessed by external(outer)block. 
		for(int i=1;i<=5;i++) { // for loop block
			int d=6;
			System.out.println(b);
			if (i==3) {
				int e=6;
				System.out.println(e);
			}
		}
		}
	
		public void sayHello(){// method block user defined block
			int c;// local variable
		}
		
		

	}


