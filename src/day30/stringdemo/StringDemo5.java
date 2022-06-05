package day30.stringdemo;

public class StringDemo5 {

	public static void main(String[] args) {
		String sentence=" Hello,I am santosh Karna. I am from kathmandu,Nepal,I am Java Developer. I teach Java part time.";
		System.out.println(sentence);
		String[]words=sentence.split(" ");
		for (String w:words) {
			System.out.println(w);
		}
		System.out.println("==========");
		words=sentence.split(",");
		for (String w:words) {
			System.out.println(w);
		}

	}

}
