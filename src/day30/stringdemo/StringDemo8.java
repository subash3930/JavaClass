package day30.stringdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo8 {

	public static void main(String[] args) {
	StringDemo8 obj=new StringDemo8();
	System.out.println(obj.isYes("Yes"));
	System.out.println(obj.isYes("yes"));
	System.out.println("=============");
	System.out.println(obj.isYesOrNo("Yes"));
	System.out.println(obj.isYesOrNo("yes"));
	System.out.println(obj.isYesOrNo("No"));
	System.out.println(obj.isYesOrNo("no"));
	System.out.println("*************");
	System.out.println(obj.isString("H"));
	System.out.println(obj.isString("1"));
	System.out.println(obj.validatePassword("abc123"));
	System.out.println(obj.validatePassword("Abc@1234"));
	System.out.println("----------------");
	System.out.println(obj.isNumber("aaa"));
	System.out.println(obj.isNumber("11"));
	

	}
	public boolean isYes(String s) {
		boolean result = s.matches("[Y|y]es");
		return result;
		
		
	}
	public boolean isYesOrNo(String s) {
	return s.matches("[Y|y]es|[N|o]");
	}
		public boolean isString(String s) {
			return s.matches("[0-9]");
		}
//		public boolean validatePassword(String password) {
//			String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
//		return password.matches(regex);
//		}
		public boolean validatePassword(String password) {
			String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher m =pattern.matcher(password);
		return m.matches();
		}
		
		public boolean isNumber(String s) {
			Pattern pattern =Pattern.compile(".*\\D.*");
			Matcher m=pattern.matcher(s);
			return m.matches();
		}
		
		
	}


