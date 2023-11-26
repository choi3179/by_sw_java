package day03.control.ex01;

import java.util.Scanner;

public class QuizIf04 {

    public static void main(String[] args) {
        int math, eng, kor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("전산 점수 입력 : ");
        math = sc.nextInt();
        System.out.print("영어 점수 입력 : ");
        eng = sc.nextInt();
        System.out.print("국어 점수 입력 : ");
        kor = sc.nextInt();

        double avg = (double)(math + eng + kor) / 3;

        if(math <= 40 || eng <= 40 || kor <= 40){
            if(math <= 40)
                System.out.print("전산 ");
            if (eng <= 40)
                System.out.print("영어 ");
            if (kor <= 40)
                System.out.print("국어 ");
            System.out.println("점수 미달로 불합격입니다.");
        }
        else{
            System.out.println("평균 : " + avg);
            if(avg >= 60)
                System.out.println("합격입니다.");
            else
                System.out.println("불합격 입니다.(평균 미달");
        }

    }

}
