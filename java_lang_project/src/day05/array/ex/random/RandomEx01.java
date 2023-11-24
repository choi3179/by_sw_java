package day05.array.ex.random;

import java.util.Random;

public class RandomEx01 {

    public static void main(String[] args) {

        System.out.println(Math.random());              // 0.0 ~ 1.0 사의의 난수 생성
        System.out.println(Math.random() * 10);         // 0.0 ~ 10.0 사의의 난수 생성
        System.out.println((int)(Math.random() * 10));  // 정수형 난수 생성(형변환)

        System.out.println();
        System.out.println();

        Random rand = new Random();
        System.out.println(rand.nextInt());                  // int 타입 범위 정수 난수
        System.out.println(rand.nextInt(5));          // 0~4 정수 난수
        System.out.println(rand.nextInt(5) + 2);      // 2~6 정수 난수

    }
}
