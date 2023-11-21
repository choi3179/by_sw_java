package day03.control.ex01;

import java.util.Scanner;

public class QuizIf02 {

    public static void main(String[] args) {

        int a,b=0;
        Scanner sc= new Scanner(System.in);

        System.out.print("두 수 입력 : ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("더 큰 수 : " + (a>b?a:b));

    }
}
