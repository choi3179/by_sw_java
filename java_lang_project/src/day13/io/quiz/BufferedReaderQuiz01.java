package day13.io.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderQuiz01 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("첫 번째 정수 입력 : ");
        int s1 = Integer.parseInt(bf.readLine());

        System.out.print("두 번째 정수 입력 : ");
        int s2 = Integer.parseInt(bf.readLine());

        System.out.print("연산자 입력 : ");
        char ch = bf.readLine().charAt(0);

        switch (ch) {
            case '+' :
                System.out.println(s1 + " + " + s2 + " = " + (s1+s2));
                break;
            case '-' :
                System.out.println(s1 + " - " + s2 + " = " + (s1-s2));
                break;
            case '*' :
                System.out.println(s1 + " * " + s2 + " = " + (s1*s2));
                break;
            case '/' :
                System.out.println(s1 + " / " + s2 + " = " + (s1/s2));
                break;
            default:
                System.out.println("연산자 입력 오류");
                break;
        }
    }
}
