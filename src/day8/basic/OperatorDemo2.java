package day8.basic;

public class OperatorDemo2 {

	public static void main(String[] args) {
		
		// 2. Assignment operator +,+=,-=,/=,*=,%=
        //Associativity left to right
		int a=4+5-7/3+2*3-7%3;
		System.out.println(a);
		
		int x=5;
		System.out.println(x);
		
		x+=5;// shorthand assignment operator ,x=x+5;
		System.out.println(x);
	}

}
