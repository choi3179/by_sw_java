package day10.api.tostring;

class Rectangle {
    int x,y;

    @Override
    public String toString() {
        String str = x + "," + y;
        return str;
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        System.out.println(r);      // toString 메소드가 자동으로 실행되며 오버라이딩된 함수를 호출
    }
}
