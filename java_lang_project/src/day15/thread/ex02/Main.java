package day15.thread.ex02;

public class Main {
    public static void main(String[] args) {
        /*Runnable t1 = new UserRunnable("r1");
        Thread tt1 = new Thread(t1);

        tt1.start();*/

        // start 메소드가 무조건 있어야 하므로 Runnable은 Thread 클래스가 필요하다.
        new Thread(new UserRunnable("r1")).start();
        new Thread(new UserRunnable("r2")).start();
        new Thread(new UserRunnable("r3")).start();
    }
}
