package day10.api.util;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();        // Calendar는 추상 클래스이다.

        System.out.print(c.get(Calendar.YEAR) + "년");
        System.out.print(" " + (c.get(Calendar.MONTH)+1) + "월");  // 월은 0부터 시작하므로 +1 해주어야 함.
        System.out.println(" " + c.get(Calendar.DATE) + "일");

        Date date = new Date();
        int h = date.getHours();
        int m = date.getMinutes();
        int s = date.getSeconds();
        System.out.println("현재 시간은 " + h + ":" + m + ":" + s);
    }
}
