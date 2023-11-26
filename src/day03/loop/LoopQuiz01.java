package day03.loop;

import java.util.Scanner;

public class LoopQuiz01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("원하는 단 입력 : ");
        int dan = sc.nextInt();

        for(int i=0;i<10;i++){
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
    }
}
