package day01.ex01.basic;

public class MainEntity {
    public static void main(String[] args) {
        int su = 9;
        char ch = 'A';
        String str = "korea";
        double d = 12.34;
        float f = 12.34f;           // float은 f 접미사가 붙어야 컴파일러에서 float 타입으로 인식(double이 default)
        long l = 100L;              // long은 L 접미사가 붙어야 Long 타입으로 인식(int가 default)

        System.out.println(su);
        System.out.println(ch);
        System.out.println(str);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);

        int x = 2;      // 기본자료형
        Integer y= 2;   // 참조형
        x=y;
        y=x;    // autoboxing / unboxing

    }
}