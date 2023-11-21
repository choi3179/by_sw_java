package day03.control.ex01;

import java.util.Scanner;

public class ExamIf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int su = 10;

        System.out.print("정수 데이터 입력: ");
        su = sc.nextInt();

        // 홀수, 짝수 판별
        if(su%2==0)
            System.out.println("짝수");
        else
            System.out.println("홀수");
    }


}
