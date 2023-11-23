package day03.control.ex02;

import java.util.Scanner;

public class NewSwitch {
    public static void main(String[] args) {

        int month = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는달 입력 : ");
        month = sc.nextInt();

        /**
         * JDK 14 버전이상에서만 사용할 수 있는 문법
         */
        /*int day = switch (month){
            case 1,3,5,7,8,10,12 -> {
                System.out.println("31일");
                yield 31;
            }
            case 4,6,9,11 -> {
                System.out.println("30일");
                yield 30;
            }
            case 2 ->{
                System.out.println("30일");
                yield 28;
            }
            default ->{
                System.out.println("없는 달을 입력하셨습니다.");
                yield 0;
            }
        };*/


    }
}
