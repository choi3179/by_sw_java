package day03.exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {
        int x=30,y=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("x값 입력 : ");
        x = sc.nextInt();
        System.out.print("y값 입력 : ");
        y = sc.nextInt();

        try {
            System.out.println("나누기 결과 : " + (x / y));
        }
        // InputMismatchException : input값이 타입과 맞지 않을 경우 에러
        // ArithmeticException : 산술 에러
        catch (Exception e){
            System.out.println("0으로 나눌 수 없습니다. >> " + e);
        }
        finally {
            System.out.println("예외 처리와 관계없이 호출");
        }

    }
}
