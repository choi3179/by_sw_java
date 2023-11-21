package day03.control.ex01;

import java.util.Scanner;

public class QuizIf01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;

        System.out.print("정수 입력 : ");
        input = sc.nextInt();

        if(input > 0)
            System.out.println("양수");
        else if(input == 0)
            System.out.println("0");
        else
            System.out.println("음수");

    }
}
