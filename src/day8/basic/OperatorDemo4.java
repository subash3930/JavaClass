package day8.basic;

public class OperatorDemo4 {

	public static void main(String[] args) {
		// 7Logical operator &&(and),||(or),!(not)
		// four conditions for and or
		int a=6,b=7,c=8;
		System.out.println(true && true);// true
		System.out.println(a<b && c>b);
		System.out.println(true && false);//false
		System.out.println(a<b && c<b);
		System.out.println(false && true);//false
		System.out.println(a>b && c>b);
		System.out.println(false && false);//false
		System.out.println(a>b && c<b);
		
		System.out.println("============");
		// || is false when both are false otherwise true
		System.out.println(true || true);// true
		System.out.println(a<b || c>b);
		System.out.println(true || false);//true
		System.out.println(a<b || c<b);
		System.out.println(false || true);//true
		System.out.println(a>b || c>b);
		System.out.println(false || false);//false
		System.out.println(a>b || c<b);
		
		System.out.println("***********************");
		// ! negation
		System.out.println(!true);//false
		System.out.println(!(a<b));
		System.out.println(!false);//true
		System.out.println(!(a>b));
		

	}

}
