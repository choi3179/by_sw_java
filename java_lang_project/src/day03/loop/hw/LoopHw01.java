package day03.loop.hw;

import java.util.Scanner;

import static java.lang.System.exit;

public class LoopHw01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a=0,b=0;
        char ch;
        int result = 0;

        System.out.print("두 수 입력 : ");
        try{
            a= sc.nextInt();
            b= sc.nextInt();
        }
        catch(Exception e){
            System.out.println("정수만 입력해 주세요.");
            exit(0);
        }

        System.out.print("연산자를 입력해 주세요. : ");
        try{
            ch = sc.next().charAt(0);
            switch (ch){
                case '+' : result = a+b; break;
                case '-' : result = a-b; break;
                case '*' : result = a*b; break;
                case '/' : result = a/b; break;
                default:
                    System.out.println("(+,-,*,/) 만 입력 가능합니다.");
            }
            System.out.println(a + " " + ch + " " + b + " = " + result);
        }
        catch(Exception e){
            System.out.println("(+,-,*,/) 만 입력 가능합니다.");
        }

    }
}
