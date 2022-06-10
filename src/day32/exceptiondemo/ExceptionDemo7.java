package day32.exceptiondemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo7 {
	public static void main(String[]args) {
		fromDatetoString(new Date());
		System.out.println("========");
		String date ="2011-01-11";
		try {
			fromStringtoDate(date);
		} catch (ParseException e) {
						e.printStackTrace();
		}
	}
	public static void fromDatetoString(Date now) {
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a MM/dd/yyyy");
		System.out.println(sdf.format(now));
	}
	public static void fromStringtoDate(String now) throws ParseException {
		System.out.println(now);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date currentdate= sdf.parse(now);
		System.out.println(currentdate);
	}
	
}

