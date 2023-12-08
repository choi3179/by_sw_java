package day15.thread.ex01;

public class Main {
    public static void main(String[] args) {

        UserThread t1 = new UserThread("t1");
        Thread t2 = new UserThread("t2");
        Thread t3 = new UserThread("t3");

        t1.start();     // run()을 유도한다.
        t2.start();
        t3.start();
    }
}
