package day06.method;

import java.util.Scanner;

public class MethodQuiz04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        plus(a,b);
        System.out.println(a+" - "+b+" = "+ sub(a,b));
        System.out.println(a+" * "+b+" = "+mul(a,b));
        div(a,b);
    }

    public static void plus(int a,int b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static void div(int a,int b){
       try{
           int result = a/b;
           System.out.println(a+" / "+b+" = "+ result);
       }
       catch(Exception e){
           System.out.println("연산 오류 : " + e);
       }
    }
}
