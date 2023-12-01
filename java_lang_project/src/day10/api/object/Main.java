package day10.api.object;

public class Main {
    public static void main(String[] args) {
        Point  pt = new Point();

        System.out.println("Point pot information");
        System.out.println("class name : " + pt.getClass());        // 클래스 정의 경로 표시
        System.out.println("hash code : " + pt.hashCode());         // 생성된 객체의 해시코드
        System.out.println("Object String : " + pt.toString());     // 객체 주소 출력
        System.out.println("Object String : " + pt);
    }
}
