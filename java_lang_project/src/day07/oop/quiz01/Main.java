package day07.oop.quiz01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int INWON = 3;
        String name = "";
        int kor = 0;
        int eng = 0;
        int math = 0;

        Score[] scores = new Score[INWON];

        for(int i=0;i<INWON;i++){
            System.out.print("이름 입력 : ");
            name = sc.next();
            System.out.print("국어 점수 입력 : ");
            kor = sc.nextInt();
            System.out.print("영어 점수 입력 : ");
            eng = sc.nextInt();
            System.out.print("전산 점수 입력 : ");
            math = sc.nextInt();
            scores[i] = new Score(name,kor,eng,math);
            System.out.println("====================");
        }

        System.out.println("\n=======성적표 출력=======");
        for(Score score : scores)
            score.output();
    }
}
