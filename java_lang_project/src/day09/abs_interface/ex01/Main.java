package day09.abs_interface.ex01;

public class Main {
    public static void main(String[] args) {

        BB bb = new BB();
        IDraw ibb = new BB();   // 인터페이스를 타입으로 하는 구현 클래스 객체 생성 가능

        bb.draw();
        ibb.draw();
        //ibb.show();     // 인터페이스 타입으로 생성한 구현 클래스의 메소드는 호출 불가 -> 오버라이딩한 메소드만 호출 가능
    }
}
