package day03.control.ex02;

import java.util.Scanner;

public class SwitchQuiz01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("짝/홀 판별 정수 입력 : ");

        try{
            int n = sc.nextInt();
            switch (n%2){
                case 0 :
                    System.out.println("짝수"); break;
                case 1 :
                    System.out.println("홀수"); break;
                default:
                    System.out.println("판별불가"); break;
            }
        }
        catch(Exception e){
            System.out.println("정수만 입력 가능");
        }


    }
}
