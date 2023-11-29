package day02.ex01;

import java.util.Scanner;

/**
    국어: 90, 영어: 88, 전산: 100
    총점과 평균구하기
 */
public class QuizScore {
    public static void main(String[] args) {

        int kor = 90;
        int eng = 88;
        int math = 100;

        Scanner sc = new Scanner(System.in);

        System.out.print("국어 : " );
        kor = sc.nextInt();
        System.out.print("영어 : ");
        eng = sc.nextInt();
        System.out.print("전산 : ");
        math = sc.nextInt();

        int result = kor + eng + math;
        System.out.println("총점 : " + result);
        System.out.printf("평균 : %.2f\n",(double)result / 3);

    }
}
