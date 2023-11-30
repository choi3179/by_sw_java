package day09.static_member;

public class Atm {

    int count;  // 인스턴스 멤버 -> 객체를 생성해야만 사용 가능
    static int total;   // static 멤버변수 -> 객체 생성 없이 사용 가능

    public Atm(int amount){
        count += amount;
        total += amount;
    }

    public void display(){      // 인스턴스 메소드에서 static 멤버변수를 사용할 수 있다.
        System.out.println("count = " + count);
        System.out.println("total = " + total);
    }

}
