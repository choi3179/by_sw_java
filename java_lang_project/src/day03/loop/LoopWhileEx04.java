package day03.loop;

import java.util.Scanner;

public class LoopWhileEx04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int kor     = 0;
        int math    = 0;
        int eng     = 0;

        int     total = 0;
        double  avg = 0;

        do{
            System.out.print("국어 점수 입력 : ");
            kor = sc.nextInt();
        } while(kor < 0 || kor > 100);

        do{
            System.out.print("전산 점수 입력 : ");
            math = sc.nextInt();
        } while(math < 0 || math > 100);

        do{
            System.out.print("영어 점수 입력 : ");
            eng = sc.nextInt();
        } while(eng < 0 || eng > 100);


        total = (kor + math + eng);
        avg = (double)(total) / 3;

        System.out.println("국어 : " + kor + " / 전산 : " + math + " / 영어 : " + eng);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", avg);

        if(avg > 90)
            System.out.println("평점 : A");
        else if(avg > 80)
            System.out.println("평점 : B");
        else if(avg > 70)
            System.out.println("평점 : C");
        else if(avg > 60)
            System.out.println("평점 : D");
        else
            System.out.println("평점 : F");


    }
}
