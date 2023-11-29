package day06.method;

import java.util.Scanner;

public class MethodQuiz03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b=0;

        a = sc.nextInt();
        b = sc.nextInt();

        more(a,b);
    }

    public static void more(int a, int b){
        System.out.println("더 큰 수 : " + (a>b?a:b));
    }
}
