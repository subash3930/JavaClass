package day28.stringsdemo;

public class StringsDemo2 {

	public static void main(String[] args) {
		String s1="Nepal";
		String s2="Nepal";
		String s3= new String("Nepal");
		String s4= new String("Nepal");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
System.out.println("==========");
// for contain check  most used
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("============");
		String s5=new String("nepal");
		System.out.println(s1.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s5));
		
		if(s1.compareTo(s2)==0) {
			System.out.println("equals");
		}else {
			System.out.println("Not equals");
		}
		
	}

}
