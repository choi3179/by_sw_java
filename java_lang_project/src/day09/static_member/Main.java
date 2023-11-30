package day09.static_member;

public class Main {

    public static void main(String[] args) {
        Atm at = new Atm(1000);
        at.display();
        System.out.println();

        Atm at2 = new Atm(1000);
        at2.display();
        System.out.println();
    }
}
