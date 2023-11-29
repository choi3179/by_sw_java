package day07.staticmethod;


class A {
    int x,y;

    // static method
    public static void setData(int xx, int yy) {
        System.out.println(xx + " / " + yy);
    }
}
public class Ex01 {
    public static void main(String[] args) {

        int x=3, y=5;

        A a = new A();
        a.setData(x,y);
    }
}
