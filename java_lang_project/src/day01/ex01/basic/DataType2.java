package day01.ex01.basic;

public class DataType2 {
    public static void main(String[] args) {
        String str = "A";
        char ch = 'A';
        char ch2 = 67;
        char ch3= 'b';

        String name = "kim";
        double dd = 3.14;

        System.out.println(ch);
        System.out.println((int)ch);        // ASCII 코드 값 출력
        System.out.println(ch2 + ", " + (char)ch2);     // ASCII 코드에 해당하는 문자 출력
        System.out.println("name= " + name);
        System.out.println("실수형 데이터: " + dd);
        System.out.printf("%10.1f %.2f\n", dd, 33.5678);
    }
}
