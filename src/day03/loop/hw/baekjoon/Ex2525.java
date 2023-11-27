package day03.loop.hw.baekjoon;

import java.util.Scanner;

import static java.lang.System.exit;

public class Ex2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = 0;  // 시
        int m = 0;  // 분

        int t = 0;  // 소요 시간

        h = sc.nextInt();
        if(h<0 || h>23) {
            System.out.println("시는 (0~23)만 입력 가능합니다.");
            exit(0);
        }

        m = sc.nextInt();
        if(m<0 || m>59) {
            System.out.println("분은 (0~59)만 입력 가능합니다.");
            exit(0);
        }

        t = sc.nextInt();
        if(t<0 || t>1000) {
            System.out.println("소요 시간은 (0~1000)만 입력 가능합니다.");
            exit(0);
        }

        m+=t;
        if(m>=60){
            h = h + m/60;
            m = m%60;
        }
        if(h > 23) {
            h = h % 24;
        }

        System.out.println(h + " " + m);
    }
}
