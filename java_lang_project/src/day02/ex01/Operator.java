package day02.ex01;

class Operator{
    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        System.out.println(x + " * " + y + "= " + x*y);

        System.out.println("\n 7 / 3 = " + (7/3));  // 정수 연산 결과는 무조건 정수가 나온다.
        System.out.println(" 7 % 3 = " + (7%3));

        System.out.println("\n 7.0 / 3.0 = " + (7.0/3.0)); // 실수 타입(double형) 연산 결과는 무조건 실수가 나온다.
        System.out.println(" 7.0 % 3.0 = " + (7.0%3.0));

        int s = 8;
        System.out.println("\n s << 2 = " + (s<<2));
        System.out.println("\n s >> 2 = " + (s>>2));
    }
}