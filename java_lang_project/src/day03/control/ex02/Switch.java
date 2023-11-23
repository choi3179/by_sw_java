package day03.control.ex02;

import java.util.Scanner;

class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("문자 처리 테스트");
        System.out.print("도시를 선택하세요(s,d,b,j) : ");
        char dosi = sc.next().charAt(0);

        switch (dosi){
            case 's' : System.out.println("서울"); break;
            case 'd' : System.out.println("대구"); break;
            case 'b' : System.out.println("부산"); break;
            case 'j' : System.out.println("제주"); break;
            default :
                System.out.println("없는 도시를 입력하였습니다.");
                System.exit(0);
        }

    }
}