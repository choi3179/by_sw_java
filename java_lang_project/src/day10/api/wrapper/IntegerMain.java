package day10.api.wrapper;

public class IntegerMain {

    public static void main(String[] args) {

        int f = Integer.parseInt("123");
        int g = Integer.parseInt("1111111", 2);     // 이진수 -> 10진수

        System.out.println(f);
        System.out.println(g);

        System.out.println("==================");

        System.out.println(Integer.toOctalString(10));  // 10진수 -> 8진수
        System.out.println(Integer.toHexString(10));    // 10진수 -> 16진수
        System.out.println(Integer.toBinaryString(10)); // 10진수 -> 2진수
    }
}
