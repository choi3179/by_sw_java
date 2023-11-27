package day6.method;

import java.util.Scanner;

public class MethodQuiz02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;

        a = sc.nextInt();
        abs(a);
    }

    public static void abs(int a){
        int k = a<0? a * (-1) : a;

        System.out.println("절댓값 = " + k);
    }
}
