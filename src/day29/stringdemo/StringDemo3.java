package day29.stringdemo;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1 = "Good morning";
		System.out.println(s1);
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 4));// End index should be more than end 1
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf("m"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.charAt(3));
		char[]ch= s1.toCharArray();
		System.out.println(ch[2]);
		System.out.println("Hello,".concat(s1));
		s1=s1+" Raju";
		System.out.println(s1);
		//s1="";
		System.out.println(s1.isEmpty());
		System.out.println(s1.isBlank());
		System.out.println("************");
		System.out.println(s1.replace("morning","Evening"));
		
		String s2=" Santosh Lal Karna ";
		System.out.println(s2);
		System.out.println(s2.trim());
		

	}

}
