package day07.oop;

class Point{

    // 멤버변수
    int x;
    int y;

    // 멤버함수 -> getter, setter
    public void setX(int xx){x=xx;}
    public int getX(){return x;}
}
public class Ex01 {
    public static void main(String[] args) {
        Point pt = new Point();     // 객체 생성, 메모리할당, 생성자 함수 자동 호ㅜㄹ
        pt.x = 3;
        pt.y = 5;
        System.out.println(pt.x + ", " + pt.y);
    }
}
