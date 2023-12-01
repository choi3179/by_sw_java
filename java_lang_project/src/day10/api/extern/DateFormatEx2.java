package ex04.util;
import java.util.*;
import java.text.*;
class DateFormatEx2{
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2005, 9, 3);	
		Date day = cal.getTime();
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4, sdf22;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("yy-MM-dd E요일");
		sdf22 = new SimpleDateFormat("yy-MM-dd e");  //?? 영문요일 
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS"); // ??
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf1.format(day)); // format(Date d)
		System.out.println(sdf2.format(day));
		System.out.println(sdf22.format(day));  //
		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));

	}
}