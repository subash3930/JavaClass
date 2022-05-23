package day7.basic;

public class OperatorDemo1 {

	public static void main(String[] args) {
		// 2. Arithmetic operator  +,-,/,*,%
		//precedence high(/,*,%) low(+,-)
        //Associativity left to right.
		int a=4+5-7/3+2*3-7%3;
		a=4+5-2+2*3-7%3;
		a=4+5-2+6-7%3;
		a=4+5-2+6-1;
		a=9-2+6-1;
		a=15-2-1;
		a=13-1;
		a=12;
		System.out.println(a);
	}

}
