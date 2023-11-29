package day02.ex01;

public class Operator2 {
    public static void main(String[] args) {
        // 삼항 연산자(조건 연산자)
        int x=20, y=10;
        String result = (x!=y) ? "not same" : "same";

        System.out.println(result);

        int a=3,b=5, result2;
        a+=b;
        System.out.println(a);
        a-=b;
        System.out.println(a);
    }
}
