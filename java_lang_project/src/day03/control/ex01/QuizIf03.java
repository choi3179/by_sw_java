package day03.control.ex01;

import java.util.Scanner;

public class QuizIf03 {
    public static void main(String[] args) {

        int year = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("년도 입력 : ");
        year = sc.nextInt();

        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0){
                System.out.println("윤년");
            }
            else{
                System.out.println("평년");
            }
        }
        else{
            System.out.println("평년");
        }


    }
}
