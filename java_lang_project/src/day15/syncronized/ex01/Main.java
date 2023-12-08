package day15.syncronized.ex01;

/**
 * 동기화 기법을 사용하여 (money) 라는 공유 자원에 대해
 * 멀티 스레드가 공유하여 사용해도 작업 이후 잔고가 맞아 떨이짐을 확인할 수 있다.
 */
public class Main {

    public static void main(String[] args) {

        Atm at = new Atm(1000);
        UserAtm user1 = new UserAtm(at,"kim");
        UserAtm user2 = new UserAtm(at,"park");
        UserAtm user3 = new UserAtm(at,"choi");

        user1.start();
        user2.start();
        user3.start();
    }
}
