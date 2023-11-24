package day03.loop.hw.baekjoon;

import java.util.Scanner;

public class Ex14681 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 0;

        x = sc.nextInt();
        y = sc.nextInt();
        if(x==0 || y == 0){
            System.out.println("좌표에 0은 입력할 수 없습니다.");
        }
        else{
            if(x > 0 && y > 0 ){
                System.out.println("1");
            }
            else if(x < 0 && y > 0 ){
                System.out.println("2");
            }
            else if(x < 0 && y < 0 ){
                System.out.println("3");
            }
            else {
                System.out.println("4");
            }
        }

    }
}
